package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
class cg implements LayoutInflater.Factory2 {
    final de a;

    public cg(de deVar) {
        this.a = deVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        dm dmVarG;
        if (cb.class.getName().equals(str)) {
            return new cb(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = cd.a;
                try {
                    if (bq.class.isAssignableFrom(cd.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.g(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        bq bqVarC = resourceId != -1 ? this.a.b.c(resourceId) : null;
                        if (bqVarC == null && string != null) {
                            bqVarC = this.a.b.d(string);
                        }
                        if (bqVarC == null && id != -1) {
                            bqVarC = this.a.b.c(id);
                        }
                        if (bqVarC == null) {
                            de deVar = this.a;
                            cd cdVarE = deVar.e();
                            context.getClassLoader();
                            bqVarC = cdVarE.b(attributeValue);
                            bqVarC.w = true;
                            bqVarC.G = resourceId != 0 ? resourceId : id;
                            bqVarC.H = id;
                            bqVarC.I = string;
                            bqVarC.x = true;
                            bqVarC.C = deVar;
                            bqVarC.D = deVar.n;
                            Context context2 = deVar.n.c;
                            Bundle bundle = bqVarC.i;
                            bqVarC.P = true;
                            dmVarG = deVar.f(bqVarC);
                            if (de.S(2)) {
                                Log.v("FragmentManager", "Fragment " + bqVarC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        } else {
                            if (bqVarC.x) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            bqVarC.x = true;
                            de deVar2 = this.a;
                            bqVarC.C = deVar2;
                            bqVarC.D = deVar2.n;
                            Context context3 = deVar2.n.c;
                            bqVarC.P = true;
                            dmVarG = deVar2.g(bqVarC);
                            if (de.S(2)) {
                                Log.v("FragmentManager", "Retained Fragment " + bqVarC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        asx asxVar = asx.a;
                        bqVarC.getClass();
                        asy asyVar = new asy(bqVarC, viewGroup);
                        asx asxVar2 = asx.a;
                        asxVar2.c(asyVar);
                        asw aswVarA = asxVar2.a(bqVarC);
                        if (aswVarA.b.contains(asv.d) && asxVar2.e(aswVarA, bqVarC.getClass(), asyVar.getClass())) {
                            asxVar2.b(aswVarA, asyVar);
                        }
                        bqVarC.Q = viewGroup;
                        dmVarG.d();
                        dmVarG.c();
                        View view2 = bqVarC.R;
                        if (view2 == null) {
                            throw new IllegalStateException(a.e(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (bqVarC.R.getTag() == null) {
                            bqVarC.R.setTag(string);
                        }
                        bqVarC.R.addOnAttachStateChangeListener(new cf(this, dmVarG));
                        return bqVarC.R;
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
