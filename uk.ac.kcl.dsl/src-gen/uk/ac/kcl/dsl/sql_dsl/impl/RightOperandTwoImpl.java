/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.sql_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.kcl.dsl.sql_dsl.CD;
import uk.ac.kcl.dsl.sql_dsl.RightOperandTwo;
import uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Operand Two</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.impl.RightOperandTwoImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightOperandTwoImpl extends MinimalEObjectImpl.Container implements RightOperandTwo
{
  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected EList<CD> column;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightOperandTwoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Sql_dslPackage.Literals.RIGHT_OPERAND_TWO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CD> getColumn()
  {
    if (column == null)
    {
      column = new EObjectResolvingEList<CD>(CD.class, this, Sql_dslPackage.RIGHT_OPERAND_TWO__COLUMN);
    }
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Sql_dslPackage.RIGHT_OPERAND_TWO__COLUMN:
        return getColumn();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Sql_dslPackage.RIGHT_OPERAND_TWO__COLUMN:
        getColumn().clear();
        getColumn().addAll((Collection<? extends CD>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Sql_dslPackage.RIGHT_OPERAND_TWO__COLUMN:
        getColumn().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Sql_dslPackage.RIGHT_OPERAND_TWO__COLUMN:
        return column != null && !column.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RightOperandTwoImpl