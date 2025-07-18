package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Collection;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzk {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final Context c;
    public final ttm d;
    public final ttm e;
    public final ttm f;
    public final ttm g;
    public final ttm h;
    public final Uri i;
    public volatile rxq j;
    public final Uri k;
    public volatile rxr l;

    public rzk(Context context, ttm ttmVar, ttm ttmVar2, ttm ttmVar3) {
        this.c = context;
        this.e = ttmVar;
        this.d = ttmVar3;
        this.f = ttmVar2;
        Pattern pattern = sjt.a;
        sjs sjsVar = new sjs(context);
        sjsVar.d("phenotype_storage_info");
        sjsVar.e("storage-info.pb");
        this.i = sjsVar.a();
        sjs sjsVar2 = new sjs(context);
        sjsVar2.d("phenotype_storage_info");
        sjsVar2.e("device-encrypted-storage-info.pb");
        int i = osx.a;
        sjsVar2.b();
        this.k = sjsVar2.a();
        this.g = sij.l(new rtb(this, 10));
        this.h = sij.l(new rtb(ttmVar, 11));
    }

    public final rxq a() {
        rxq rxqVar;
        rxq rxqVar2 = this.j;
        if (rxqVar2 != null) {
            return rxqVar2;
        }
        synchronized (a) {
            rxqVar = this.j;
            if (rxqVar == null) {
                rxqVar = rxq.b;
                if (osx.g(this.c)) {
                    skp skpVarB = skp.b(rxqVar);
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        rxq rxqVar3 = (rxq) ((aafi) this.f.get()).r(this.i, skpVarB);
                        StrictMode.setThreadPolicy(threadPolicy);
                        rxqVar = rxqVar3;
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                    this.j = rxqVar;
                }
            }
        }
        return rxqVar;
    }

    public final rxr b() {
        rxr rxrVar;
        rxr rxrVar2 = this.l;
        if (rxrVar2 != null) {
            return rxrVar2;
        }
        synchronized (b) {
            rxrVar = this.l;
            if (rxrVar == null) {
                rxrVar = rxr.b;
                skp skpVarB = skp.b(rxrVar);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        rxr rxrVar3 = (rxr) ((aafi) this.f.get()).r(this.k, skpVarB);
                        StrictMode.setThreadPolicy(threadPolicy);
                        rxrVar = rxrVar3;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (IOException unused) {
                }
                this.l = rxrVar;
            }
        }
        return rxrVar;
    }

    public final rzd c(boolean z) {
        boolean z2;
        ImmutableList immutableListCopyOf;
        vsz vszVar;
        String str;
        ImmutableList immutableListCopyOf2;
        ImmutableList immutableListCopyOf3;
        int i;
        boolean z3;
        boolean z4;
        String str2 = "";
        if (z) {
            rxr rxrVarB = b();
            z2 = rxrVarB.e;
            immutableListCopyOf = ImmutableList.copyOf((Collection) new vul(rxrVarB.i, rxr.a));
            vszVar = rxrVarB.d;
            str = rxrVarB.f;
            immutableListCopyOf2 = ImmutableList.copyOf((Collection) rxrVarB.g);
            immutableListCopyOf3 = ImmutableList.copyOf((Collection) rxrVarB.h);
            if ((rxrVarB.c & 8) != 0) {
                rxs rxsVar = rxrVarB.j;
                if (rxsVar == null) {
                    rxsVar = rxs.a;
                }
                if (rxsVar.c == Build.VERSION.SDK_INT) {
                    rxs rxsVar2 = rxrVarB.j;
                    if (rxsVar2 == null) {
                        rxsVar2 = rxs.a;
                    }
                    str2 = rxsVar2.b;
                }
            }
            i = rxrVarB.c & 1;
            z3 = rxrVarB.l;
            z4 = rxrVarB.k;
        } else {
            rxq rxqVarA = a();
            z2 = rxqVarA.e;
            immutableListCopyOf = ImmutableList.copyOf((Collection) new vul(rxqVarA.j, rxq.a));
            vszVar = rxqVarA.d;
            str = rxqVarA.f;
            immutableListCopyOf2 = ImmutableList.copyOf((Collection) rxqVarA.h);
            immutableListCopyOf3 = ImmutableList.copyOf((Collection) rxqVarA.i);
            if ((rxqVarA.c & 16) != 0) {
                rxs rxsVar3 = rxqVarA.k;
                if (rxsVar3 == null) {
                    rxsVar3 = rxs.a;
                }
                if (rxsVar3.c == Build.VERSION.SDK_INT) {
                    rxs rxsVar4 = rxqVarA.k;
                    if (rxsVar4 == null) {
                        rxsVar4 = rxs.a;
                    }
                    str2 = rxsVar4.b;
                }
            }
            i = rxqVarA.c & 1;
            z3 = rxqVarA.m;
            z4 = rxqVarA.l;
        }
        return new rzd(z2, immutableListCopyOf, vszVar, str, str2, immutableListCopyOf2, immutableListCopyOf3, 1 == i, z3, z4);
    }
}
