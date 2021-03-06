package org.jetbrains.haskell.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.util.PsiTreeUtil


public class ValueDefinition(node : ASTNode) : ASTWrapperPsiElement(node) {
    fun getQNameExpression(): QNameExpression? =
            findChildByClass(javaClass<QNameExpression>())

    fun getExpression(): Expression? =
            findChildByClass(javaClass<Expression>())
}