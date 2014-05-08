package test;

import hx.xuyu.Block;
import hx.xuyu.Exp;
import hx.xuyu.Stat;
import hx.xuyu.XuyuCompiler;

public class XuyuTest {

	public static void main(String[] arg){
		
		XuyuCompiler xc = new XuyuCompiler();
		
		hx.xuyu.Block b = xc.pushBlock();
		
		//if 2 * 3 -4 == 2, print what the hell
		xc.pushBlock();
		xc.addStat(new Stat.PRINT("[What the hell¡¾»Ø¡¿]"));
		Exp.Value v = new Exp.Num(2);
		v = new Exp.Eval(v, new Exp.Num(3), Exp.Eval.MUL);
		v = new Exp.Eval(v, new Exp.Num(4), Exp.Eval.SUB);
		v = new Exp.Eval(v, new Exp.Num(2), Exp.Eval.EQ);
		xc.addStat(new Stat.IF(v, xc.popBlock()));
		
		//athing = 5, 
		//while athing > 0 do 
		//		athing = athing - 1
		//		if(athing == 2)continue
		//		print athing , 
		xc.addStat(new Stat.ASSIGN("athing", new Exp.Num(5)));
		xc.pushBlock();
		Exp.Var var = new Exp.Var("athing", xc.currentBlock());
		xc.addStat(new Stat.ASSIGN("athing", new Exp.Eval(var, new Exp.Num(1), Exp.Eval.SUB)));
		
		xc.pushBlock();
		xc.addStat(new Stat.CONTINUE());
		xc.addStat(new Stat.IF(new Exp.Eval(var.deepCopy(), new Exp.Num(2), Exp.Eval.EQ), xc.popBlock()));
		
		xc.addStat(new Stat.PRINT(var.deepCopy()));		
		
		xc.addStat(new Stat.WHILE(new Exp.Eval(var.deepCopy(), new Exp.Num(0), Exp.Eval.GT), xc.popBlock()));
		
		// printer = func(str) print str; print str;
		// printer(2);
		xc.pushBlock();
		xc.addStat(new Stat.PRINT(new Exp.Var("str", xc.currentBlock())));
		xc.addStat(new Stat.PRINT(new Exp.Var("str", xc.currentBlock())));
		Exp.Func afunc = new Exp.Func(xc.popBlock(), "str");
		xc.addStat(new Stat.ASSIGN("printer", afunc));
		
		xc.addStat(new Stat.EXP(new Exp.Call(new Exp.Var("printer", xc.currentBlock()), new Exp.Num(2))));
		
		xc.popAllBlock();
		
		b.exec();
		
	}
	
}
