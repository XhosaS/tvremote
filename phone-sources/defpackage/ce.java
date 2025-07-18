package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ce implements LayoutInflater.Factory2 {
    public final cr a;

    public ce(cr crVar) {
        this.a = crVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        nxo nxoVarAn;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ar.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = cc.a;
                try {
                    if (bv.class.isAssignableFrom(cc.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.cl(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        bv bvVarE = resourceId != -1 ? this.a.e(resourceId) : null;
                        if (bvVarE == null && string != null) {
                            bvVarE = this.a.f(string);
                        }
                        if (bvVarE == null && id != -1) {
                            bvVarE = this.a.e(id);
                        }
                        if (bvVarE == null) {
                            cr crVar = this.a;
                            cc ccVarI = crVar.i();
                            context.getClassLoader();
                            bv bvVarB = ccVarI.b(attributeValue);
                            bvVarB.mFromLayout = true;
                            bvVarB.mFragmentId = resourceId != 0 ? resourceId : id;
                            bvVarB.mContainerId = id;
                            bvVarB.mTag = string;
                            bvVarB.mInLayout = true;
                            bvVarB.mFragmentManager = crVar;
                            bvVarB.mHost = crVar.m;
                            bvVarB.onInflate(crVar.m.c, attributeSet, bvVarB.mSavedFragmentState);
                            nxoVarAn = crVar.am(bvVarB);
                            if (cr.Y(2)) {
                                Objects.toString(bvVarB);
                                Integer.toHexString(resourceId);
                            }
                            bvVarE = bvVarB;
                        } else {
                            if (bvVarE.mInLayout) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            bvVarE.mInLayout = true;
                            cr crVar2 = this.a;
                            bvVarE.mFragmentManager = crVar2;
                            bvVarE.mHost = crVar2.m;
                            bvVarE.onInflate(crVar2.m.c, attributeSet, bvVarE.mSavedFragmentState);
                            nxoVarAn = crVar2.an(bvVarE);
                            if (cr.Y(2)) {
                                Objects.toString(bvVarE);
                                Integer.toHexString(resourceId);
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i2 = dia.a;
                        bvVarE.getClass();
                        dib dibVar = new dib(bvVarE, viewGroup);
                        dia.d(dibVar);
                        dhz dhzVarB = dia.b(bvVarE);
                        if (dhzVarB.b.contains(dhy.d) && dia.e(dhzVarB, bvVarE.getClass(), dibVar.getClass())) {
                            dia.c(dhzVarB, dibVar);
                        }
                        bvVarE.mContainer = viewGroup;
                        nxoVarAn.i();
                        nxoVarAn.h();
                        View view2 = bvVarE.mView;
                        if (view2 == null) {
                            throw new IllegalStateException(a.cg(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (bvVarE.mView.getTag() == null) {
                            bvVarE.mView.setTag(string);
                        }
                        bvVarE.mView.addOnAttachStateChangeListener(new cdr(this, nxoVarAn, 1));
                        return bvVarE.mView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
