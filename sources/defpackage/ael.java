package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ael {
    private static volatile ael d;
    public int a;
    public final Object b;
    public final Object c;

    public ael() {
        this.a = 0;
        this.c = new bqk(1);
        this.b = new bqk(0);
    }

    public static ael c(Context context) {
        if (d == null) {
            synchronized (ael.class) {
                if (d == null) {
                    d = new ael(context);
                }
            }
        }
        return d;
    }

    public static final long k(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized aek a() {
        return (aek) this.c.peek();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized aek b() {
        ?? r0 = this.c;
        aek aekVar = (aek) r0.peek();
        if (aekVar != null) {
            int i = aekVar.c + 1;
            aekVar.c = i;
            if (i >= cpr.a.aL().b((Context) this.b)) {
                return (aek) r0.poll();
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized boolean d(adt adtVar) {
        byte[] bArr = adtVar.b;
        bArr.getClass();
        int length = bArr.length;
        ?? r1 = this.c;
        long size = r1.size();
        cpr cprVar = cpr.a;
        cps cpsVarAL = cprVar.aL();
        Object obj = this.b;
        if (size < cpsVarAL.c((Context) obj)) {
            if (this.a + length < cprVar.aL().a((Context) obj)) {
                r1.add(new aek(adtVar));
                this.a += length;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    final synchronized void e() {
        aek aekVar = (aek) this.c.poll();
        if (aekVar != null) {
            byte[] bArr = aekVar.a.b;
            bArr.getClass();
            this.a -= bArr.length;
        }
    }

    public final boolean f() {
        return this.c != null;
    }

    public final boolean g() {
        Object obj;
        return this.c == null && (obj = this.b) != null && ((ColorStateList) obj).isStateful();
    }

    public final boolean h(int[] iArr) {
        if (!g()) {
            return false;
        }
        ColorStateList colorStateList = (ColorStateList) this.b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.a) {
            return false;
        }
        this.a = colorForState;
        return true;
    }

    public final boolean i() {
        return f() || this.a != 0;
    }

    public final iq j(int i) {
        SparseArray sparseArray = (SparseArray) this.b;
        iq iqVar = (iq) sparseArray.get(i);
        if (iqVar != null) {
            return iqVar;
        }
        iq iqVar2 = new iq();
        sparseArray.put(i, iqVar2);
        return iqVar2;
    }

    public ael(Shader shader, ColorStateList colorStateList, int i) {
        this.c = shader;
        this.b = colorStateList;
        this.a = i;
    }

    private ael(Context context) {
        this.a = 0;
        this.c = new ArrayDeque();
        this.b = context;
    }

    public ael(byte[] bArr) {
        this.b = new SparseArray();
        this.a = 0;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }
}
