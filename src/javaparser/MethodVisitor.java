package javaparser;

import java.util.ArrayList;
import java.util.List;

import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

class MethodVisitor extends VoidVisitorAdapter{
		public List<Method> methodList = new ArrayList<Method>();
		
		// Override the visit function
		public MethodVisitor() {}
        @Override
        public void visit(MethodDeclaration m, Object arg) {
        	Method method = new Method();
        	method.methodName = m.getName();
        	method.methodNameExpr = m.getNameExpr();
        	method.methodParameters = m.getParameters();
        	method.methodThrows = m.getThrows();
        	method.methodType = m.getType();
        	method.methodTypeParameters = m.getTypeParameters();
        	methodList.add(method);
        	
        	/****** test *******/
        	System.out.println("methodParameters:");
        	System.out.println(method.methodParameters);
        	System.out.println("methodTypeParameters:");
        	System.out.println(method.methodTypeParameters);
        }
    }