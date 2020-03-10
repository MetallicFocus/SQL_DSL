/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.sql_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.kcl.dsl.sql_dsl.CD;
import uk.ac.kcl.dsl.sql_dsl.SetClause;
import uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.impl.SetClauseImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.impl.SetClauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.impl.SetClauseImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetClauseImpl extends MinimalEObjectImpl.Container implements SetClause
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final int VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected int val = VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetClauseImpl()
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
    return Sql_dslPackage.Literals.SET_CLAUSE;
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
      column = new EObjectResolvingEList<CD>(CD.class, this, Sql_dslPackage.SET_CLAUSE__COLUMN);
    }
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sql_dslPackage.SET_CLAUSE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(int newVal)
  {
    int oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sql_dslPackage.SET_CLAUSE__VAL, oldVal, val));
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
      case Sql_dslPackage.SET_CLAUSE__COLUMN:
        return getColumn();
      case Sql_dslPackage.SET_CLAUSE__NAME:
        return getName();
      case Sql_dslPackage.SET_CLAUSE__VAL:
        return getVal();
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
      case Sql_dslPackage.SET_CLAUSE__COLUMN:
        getColumn().clear();
        getColumn().addAll((Collection<? extends CD>)newValue);
        return;
      case Sql_dslPackage.SET_CLAUSE__NAME:
        setName((String)newValue);
        return;
      case Sql_dslPackage.SET_CLAUSE__VAL:
        setVal((Integer)newValue);
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
      case Sql_dslPackage.SET_CLAUSE__COLUMN:
        getColumn().clear();
        return;
      case Sql_dslPackage.SET_CLAUSE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Sql_dslPackage.SET_CLAUSE__VAL:
        setVal(VAL_EDEFAULT);
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
      case Sql_dslPackage.SET_CLAUSE__COLUMN:
        return column != null && !column.isEmpty();
      case Sql_dslPackage.SET_CLAUSE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Sql_dslPackage.SET_CLAUSE__VAL:
        return val != VAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //SetClauseImpl
