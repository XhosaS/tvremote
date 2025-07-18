package defpackage;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Handler;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwi {
    public final Object a;
    public final Object b;

    public dwi(Intent intent, ArrayList arrayList) {
        this.b = intent;
        this.a = arrayList;
    }

    public static void v(dwi dwiVar, long j) {
        dwiVar.s("exo_len", Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ghb, java.lang.Object] */
    public final ghb a() {
        return ((gag) this.b).c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    public final Object b(String str) {
        Object objD;
        Object obj = this.b;
        try {
            yvc yvcVar = (yvc) ((gag) obj).e.get(str);
            if (yvcVar != null && (objD = yvcVar.d()) != null) {
                return objD;
            }
            return ((gag) obj).a.get(str);
        } catch (ClassCastException unused) {
            gag gagVar = (gag) obj;
            gagVar.a.remove(str);
            gagVar.b.remove(str);
            gagVar.e.remove(str);
            return null;
        }
    }

    public final void c(Exception exc) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new edd(this, exc, 17));
        }
    }

    public final void d(int i) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new csl(this, i, 4));
        }
    }

    public final void e(Exception exc) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new edd(this, exc, 18));
        }
    }

    public final void f(elt eltVar) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new edd(this, eltVar, 15));
        }
    }

    public final void g(elt eltVar) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new edd(this, eltVar, 16));
        }
    }

    public final void h(String str, long j, long j2) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new fcd(this, str, j, j2, 1));
        }
    }

    public final void i(String str) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new edd(this, str, 19));
        }
    }

    public final void j(ehw ehwVar) {
        ehwVar.a();
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new edd(this, ehwVar, 14, null));
        }
    }

    public final void k(ehw ehwVar) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new edd(this, ehwVar, 13, null));
        }
    }

    public final void l(dze dzeVar, ehx ehxVar) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new bd((Object) this, (Object) dzeVar, (Object) ehxVar, 5, (short[]) null));
        }
    }

    public final void m(long j) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new ley(this, j, 1));
        }
    }

    public final void n(boolean z) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new hum(this, z, 1, null));
        }
    }

    public final void o(int i, long j, long j2) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new ezl(this, i, j, j2, 1));
        }
    }

    public final int p() {
        return ((dzb) this.a).b();
    }

    public final ekl q(int i) {
        ekl eklVar = (ekl) ((SparseArray) this.b).get(i);
        eklVar.getClass();
        return eklVar;
    }

    public final boolean r(int i) {
        return ((dzb) this.a).c(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void s(String str, Object obj) {
        obj.getClass();
        this.b.put(str, obj);
        this.a.remove(str);
    }

    public final void t() {
        ((File) this.a).delete();
        ((File) this.b).delete();
    }

    public final boolean u() {
        return ((File) this.a).exists() || ((File) this.b).exists();
    }

    public dwi(ymh ymhVar, yjv yjvVar) {
        this.a = ymhVar;
        this.b = yjvVar;
    }

    public dwi() {
        this.a = new LinkedHashMap();
        this.b = new gag((byte[]) null);
    }

    public dwi(File file) {
        this.a = file;
        this.b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public dwi(List list, int[] iArr, char[] cArr) {
        this.b = ImmutableList.copyOf((Collection) list);
        this.a = iArr;
    }

    public dwi(List list, int[] iArr, byte[] bArr) {
        this.a = ImmutableList.copyOf((Collection) list);
        this.b = iArr;
    }

    public dwi(Map map) {
        this.a = new LinkedHashMap();
        this.b = new gag(map);
    }

    public dwi(List list, int[] iArr) {
        this.a = ImmutableList.copyOf((Collection) list);
        this.b = iArr;
    }

    public dwi(byte[] bArr) {
        this.b = new HashMap();
        this.a = new ArrayList();
    }

    public dwi(MediaCodec.CryptoInfo cryptoInfo) {
        this.b = cryptoInfo;
        this.a = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public dwi(dzb dzbVar, SparseArray sparseArray) {
        this.a = dzbVar;
        SparseArray sparseArray2 = new SparseArray(dzbVar.b());
        for (int i = 0; i < dzbVar.b(); i++) {
            int iA = dzbVar.a(i);
            ekl eklVar = (ekl) sparseArray.get(iA);
            eklVar.getClass();
            sparseArray2.append(iA, eklVar);
        }
        this.b = sparseArray2;
    }

    public dwi(Handler handler, els elsVar) {
        if (elsVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.a = elsVar;
    }
}
