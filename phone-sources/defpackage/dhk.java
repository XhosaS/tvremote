package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.autofill.AutofillId;
import android.widget.EditText;
import j$.util.DesugarCollections;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhk {
    public final Object a;
    public final Object b;

    public dhk(int i, int i2) {
        this.b = new int[]{i, i2};
        this.a = new float[]{0.0f, 1.0f};
    }

    public static /* synthetic */ List b(Object[] objArr) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        obj.getClass();
        arrayList.add(obj);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final void a(Runnable runnable) {
        ((Choreographer) this.b).postFrameCallback(new dgq(runnable, 0));
    }

    public final AutofillId c(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        Object obj = this.a;
        cvw cvwVarX = cbp.x((View) this.b);
        cvwVarX.getClass();
        return abh$$ExternalSyntheticApiModelOutline0.m23m(obj).newAutofillId(bb$$ExternalSyntheticApiModelOutline1.m(cvwVarX.a), j);
    }

    public final void d() {
        Reference referencePoll;
        do {
            referencePoll = ((ReferenceQueue) this.a).poll();
            if (referencePoll != null) {
                ((bfz) this.b).n(referencePoll);
            }
        } while (referencePoll != null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjk] */
    public final Object e(int i) {
        Object objD = ((bfz) this.a).d(i);
        this.b.a();
        return objD;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yjk] */
    public final void f(int i, Object obj) {
        ((bfz) this.a).g(i, obj);
        this.b.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final bvt g() {
        return (bvt) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void h(zuw zuwVar) {
        int i = zuwVar.a;
        if (i != 0) {
            this.b.execute(new csl(this.a, i, 2, (byte[]) null));
        } else {
            Object obj = zuwVar.b;
            this.b.execute(new be((cri) this.a, (Typeface) obj, 14));
        }
    }

    public dhk(int i, int i2, int i3) {
        this.b = new int[]{i, i2, i3};
        this.a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public dhk(cff cffVar, cmg cmgVar) {
        this.b = cffVar;
        this.a = cmgVar;
    }

    public dhk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public dhk(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public dhk(bys bysVar, bvt bvtVar) {
        this.a = bysVar;
        this.b = new bci(bvtVar, bcz.c);
    }

    public dhk(cff cffVar, jc jcVar) {
        this.a = cffVar.c;
        this.b = new je(cffVar.j().size());
        List listJ = cffVar.j();
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            cff cffVar2 = (cff) listJ.get(i);
            if (jcVar.b(cffVar2.e)) {
                ((je) this.b).d(cffVar2.e);
            }
        }
    }

    public dhk(List list, List list2) {
        int size = list.size();
        this.b = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.a)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public dhk(byte[] bArr) {
        this.b = new cko();
        this.a = new jp(16);
    }

    public dhk() {
        this.b = Choreographer.getInstance();
        this.a = Looper.myLooper();
    }

    public dhk(EditText editText) {
        crl.k(editText, "editText cannot be null");
        this.a = editText;
        dhr dhrVar = new dhr(editText);
        this.b = dhrVar;
        editText.addTextChangedListener(dhrVar);
        editText.setEditableFactory(dhl.a());
    }

    public dhk(char[] cArr) {
        this.b = new bfz(new Reference[16], 0);
        this.a = new ReferenceQueue();
    }
}
