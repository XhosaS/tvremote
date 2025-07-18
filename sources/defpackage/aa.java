package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aa implements LayoutInflater.Factory2 {
    final am a;

    public aa(am amVar) {
        this.a = amVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ar arVarG;
        if (w.class.getName().equals(str)) {
            return new w(context, attributeSet, this.a);
        }
        q qVarB = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = x.a;
                try {
                    if (q.class.isAssignableFrom(x.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        q qVarC = resourceId != -1 ? this.a.c(resourceId) : null;
                        if (qVarC == null && string != null) {
                            as asVar = this.a.b;
                            ArrayList arrayList = asVar.a;
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    q qVar = (q) arrayList.get(size);
                                    if (qVar != null && string.equals(qVar.C)) {
                                        qVarB = qVar;
                                        break;
                                    }
                                    size--;
                                } else {
                                    Iterator it = asVar.b.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        ar arVar = (ar) it.next();
                                        if (arVar != null) {
                                            q qVar2 = arVar.a;
                                            if (string.equals(qVar2.C)) {
                                                qVarB = qVar2;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            qVarB = qVarC;
                        }
                        if (qVarB == null && id != -1) {
                            qVarB = this.a.c(id);
                        }
                        if (qVarB == null) {
                            am amVar = this.a;
                            x xVarE = amVar.e();
                            context.getClassLoader();
                            qVarB = xVarE.b(attributeValue);
                            qVarB.q = true;
                            qVarB.A = resourceId != 0 ? resourceId : id;
                            qVarB.B = id;
                            qVarB.C = string;
                            qVarB.r = true;
                            qVarB.w = amVar;
                            qVarB.x = amVar.l;
                            Context context2 = amVar.l.c;
                            Bundle bundle = qVarB.c;
                            qVarB.F();
                            arVarG = amVar.f(qVarB);
                            if (am.S(2)) {
                                Log.v("FragmentManager", "Fragment " + qVarB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        } else {
                            if (qVarB.r) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            qVarB.r = true;
                            am amVar2 = this.a;
                            qVarB.w = amVar2;
                            qVarB.x = amVar2.l;
                            Context context3 = amVar2.l.c;
                            qVarB.F();
                            arVarG = amVar2.g(qVarB);
                            if (am.S(2)) {
                                Log.v("FragmentManager", "Retained Fragment " + qVarB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i2 = up.a;
                        qVarB.getClass();
                        uq uqVar = new uq(qVarB, viewGroup);
                        up.d(uqVar);
                        uo uoVarB = up.b(qVarB);
                        if (uoVarB.b.contains(un.d) && up.e(uoVarB, qVarB.getClass(), uqVar.getClass())) {
                            up.c(uoVarB, uqVar);
                        }
                        qVarB.K = viewGroup;
                        arVarG.d();
                        arVarG.c();
                        View view2 = qVarB.L;
                        if (view2 == null) {
                            throw new IllegalStateException(b.c(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (qVarB.L.getTag() == null) {
                            qVarB.L.setTag(string);
                        }
                        qVarB.L.addOnAttachStateChangeListener(new z(this, arVarG));
                        return qVarB.L;
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
