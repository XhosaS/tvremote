package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfl implements lfk {
    public final ContentResolver a;

    static {
        uof.g(',').f().i();
    }

    public lfl(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.lfk
    public final float a(String str, float f) throws NumberFormatException {
        Object obj;
        Float fValueOf;
        opj opjVar = opc.a;
        ContentResolver contentResolver = this.a;
        opj.e(contentResolver);
        String strConcat = "videos:".concat(str);
        synchronized (opjVar) {
            opjVar.c(contentResolver);
            obj = opjVar.f;
            fValueOf = (Float) opj.f(opjVar.e, strConcat, Float.valueOf(f));
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        String strA = opjVar.a(contentResolver, strConcat, null);
        if (strA != null) {
            try {
                float f2 = Float.parseFloat(strA);
                fValueOf = Float.valueOf(f2);
                f = f2;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (opjVar) {
            opjVar.d(obj, opjVar.e, strConcat, fValueOf);
        }
        return f;
    }

    @Override // defpackage.lfk
    public final int b(String str, int i) {
        return opc.a(this.a, "videos:".concat(str), i);
    }

    @Override // defpackage.lfk
    public final long c(String str, long j) {
        return opc.b(this.a, "videos:".concat(str), j);
    }

    @Override // defpackage.lfk
    public final String d(String str, String str2) {
        return opc.d(this.a, "videos:".concat(str), str2);
    }

    @Override // defpackage.lfk
    public final boolean e(String str, boolean z) {
        return opc.f(this.a, "videos:".concat(str), z);
    }
}
