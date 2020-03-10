/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.sql_dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.kcl.dsl.sql_dsl.AlterTableStatement;
import uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage;
import uk.ac.kcl.dsl.sql_dsl.TableName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alter Table Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.impl.AlterTableStatementImpl#getTable <em>Table</em>}</li>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.impl.AlterTableStatementImpl#getAddDropUpdate <em>Add Drop Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlterTableStatementImpl extends StatementImpl implements AlterTableStatement
{
  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected EList<TableName> table;

  /**
   * The cached value of the '{@link #getAddDropUpdate() <em>Add Drop Update</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddDropUpdate()
   * @generated
   * @ordered
   */
  protected EObject addDropUpdate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlterTableStatementImpl()
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
    return Sql_dslPackage.Literals.ALTER_TABLE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TableName> getTable()
  {
    if (table == null)
    {
      table = new EObjectResolvingEList<TableName>(TableName.class, this, Sql_dslPackage.ALTER_TABLE_STATEMENT__TABLE);
    }
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getAddDropUpdate()
  {
    return addDropUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddDropUpdate(EObject newAddDropUpdate, NotificationChain msgs)
  {
    EObject oldAddDropUpdate = addDropUpdate;
    addDropUpdate = newAddDropUpdate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sql_dslPackage.ALTER_TABLE_STATEMENT__ADD_DROP_UPDATE, oldAddDropUpdate, newAddDropUpdate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAddDropUpdate(EObject newAddDropUpdate)
  {
    if (newAddDropUpdate != addDropUpdate)
    {
      NotificationChain msgs = null;
      if (addDropUpdate != null)
        msgs = ((InternalEObject)addDropUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sql_dslPackage.ALTER_TABLE_STATEMENT__ADD_DROP_UPDATE, null, msgs);
      if (newAddDropUpdate != null)
        msgs = ((InternalEObject)newAddDropUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sql_dslPackage.ALTER_TABLE_STATEMENT__ADD_DROP_UPDATE, null, msgs);
      msgs = basicSetAddDropUpdate(newAddDropUpdate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sql_dslPackage.ALTER_TABLE_STATEMENT__ADD_DROP_UPDATE, newAddDropUpdate, newAddDropUpdate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Sql_dslPackage.ALTER_TABLE_STATEMENT__ADD_DROP_UPDATE:
        return basicSetAddDropUpdate(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case Sql_dslPackage.ALTER_TABLE_STATEMENT__TABLE:
        return getTable();
      case Sql_dslPackage.ALTER_TABLE_STATEMENT__ADD_DROP_UPDATE:
        return getAddDropUpdate();
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
      case Sql_dslPackage.ALTER_TABLE_STATEMENT__TABLE:
        getTable().clear();
        getTable().addAll((Collection<? extends TableName>)newValue);
        return;
      case Sql_dslPackage.ALTER_TABLE_STATEMENT__ADD_DROP_UPDATE:
        setAddDropUpdate((EObject)newValue);
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
      case Sql_dslPackage.ALTER_TABLE_STATEMENT__TABLE:
        getTable().clear();
        return;
      case Sql_dslPackage.ALTER_TABLE_STATEMENT__ADD_DROP_UPDATE:
        setAddDropUpdate((EObject)null);
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
      case Sql_dslPackage.ALTER_TABLE_STATEMENT__TABLE:
        return table != null && !table.isEmpty();
      case Sql_dslPackage.ALTER_TABLE_STATEMENT__ADD_DROP_UPDATE:
        return addDropUpdate != null;
    }
    return super.eIsSet(featureID);
  }

} //AlterTableStatementImpl
