package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rni {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final yrp c;
    public final yrp d;
    public final yrp e;
    public final yrp f;
    public final Uri g;
    public volatile rhr h;
    public final Uri i;
    public volatile rhu j;
    private final Context k;
    private final yrp l;

    public rni(Context context, final yrp yrpVar, yrp yrpVar2, yrp yrpVar3) {
        this.k = context;
        this.d = yrpVar;
        this.c = yrpVar3;
        this.e = yrpVar2;
        int i = uem.b;
        uel uelVar = new uel(context);
        uem.b("phenotype_storage_info");
        uelVar.c = "phenotype_storage_info";
        uelVar.b("storage-info.pb");
        this.g = uelVar.a();
        uel uelVar2 = new uel(context);
        uem.b("phenotype_storage_info");
        uelVar2.c = "phenotype_storage_info";
        uelVar2.b("device-encrypted-storage-info.pb");
        int i2 = mhv.a;
        uem.a("directboot-files");
        uelVar2.b = "directboot-files";
        this.i = uelVar2.a();
        this.f = yru.a(new yrp() { // from class: rnf
            @Override // defpackage.yrp
            public final Object eV() {
                final rni rniVar = this.a;
                zyh zyhVar = (zyh) rniVar.d.eV();
                zyhVar.getClass();
                rgy rgyVar = (rgy) rniVar.c.eV();
                rgyVar.getClass();
                final zyd zydVarG = zuz.g(zud.g(zwx.u(rgyVar.d()), rgz.class, new yqi() { // from class: rnb
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        rgz rgzVar = (rgz) obj;
                        if (rgzVar.a != 29514) {
                            throw rgzVar;
                        }
                        rhy rhyVar = rhy.a;
                        rhx rhxVar = new rhx();
                        abxk abxkVar = rhr.a;
                        rhq rhqVar = new rhq();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if ((rhqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            rhqVar.y();
                        }
                        rhr rhrVar = (rhr) rhqVar.b;
                        rhrVar.c |= 8;
                        rhrVar.g = jCurrentTimeMillis;
                        if ((rhxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            rhxVar.y();
                        }
                        rhy rhyVar2 = (rhy) rhxVar.b;
                        rhr rhrVar2 = (rhr) rhqVar.v();
                        rhrVar2.getClass();
                        rhyVar2.c = rhrVar2;
                        rhyVar2.b |= 1;
                        return (rhy) rhxVar.v();
                    }
                }, zyhVar), new yqi() { // from class: rnc
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        rhy rhyVar = (rhy) obj;
                        ufd ufdVar = new ufd();
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                        rni rniVar2 = rniVar;
                        try {
                            try {
                                synchronized (rni.a) {
                                    ueg uegVar = (ueg) rniVar2.e.eV();
                                    Uri uri = rniVar2.g;
                                    rhr rhrVar = rhyVar.c;
                                    if (rhrVar == null) {
                                        rhrVar = rhr.b;
                                    }
                                    uhm uhmVar = new uhm(rhrVar);
                                    uhmVar.a = new ufd[]{ufdVar};
                                    uegVar.c(uri, uhmVar);
                                    rhr rhrVar2 = rhyVar.c;
                                    if (rhrVar2 == null) {
                                        rhrVar2 = rhr.b;
                                    }
                                    rniVar2.h = rhrVar2;
                                }
                                synchronized (rni.b) {
                                    ueg uegVar2 = (ueg) rniVar2.e.eV();
                                    Uri uri2 = rniVar2.i;
                                    rhu rhuVar = rhyVar.d;
                                    if (rhuVar == null) {
                                        rhuVar = rhu.b;
                                    }
                                    uhm uhmVar2 = new uhm(rhuVar);
                                    uhmVar2.a = new ufd[]{ufdVar};
                                    uegVar2.c(uri2, uhmVar2);
                                    rhu rhuVar2 = rhyVar.d;
                                    if (rhuVar2 == null) {
                                        rhuVar2 = rhu.b;
                                    }
                                    rniVar2.j = rhuVar2;
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                                return null;
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    }
                }, zyhVar);
                zydVarG.d(new Runnable() { // from class: rnd
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            zxn.o(zydVarG);
                        } catch (Exception e) {
                            if (Log.isLoggable("StorageInfoHandler", 3)) {
                                Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e);
                            }
                        }
                    }
                }, zyhVar);
                return zydVarG;
            }
        });
        this.l = yru.a(new yrp() { // from class: rng
            @Override // defpackage.yrp
            public final Object eV() {
                zyh zyhVar = (zyh) yrpVar.eV();
                zyhVar.getClass();
                return zyhVar.schedule(new Callable() { // from class: rnh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, 10000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    public final rhr a() {
        rhr rhrVar;
        rhr rhrVar2 = this.h;
        if (rhrVar2 != null) {
            return rhrVar2;
        }
        synchronized (a) {
            rhrVar = this.h;
            if (rhrVar == null) {
                rhrVar = rhr.b;
                if (mhv.h(this.k)) {
                    uhh uhhVarB = uhh.b(rhrVar);
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        rhr rhrVar3 = (rhr) ((ueg) this.e.eV()).c(this.g, uhhVarB);
                        StrictMode.setThreadPolicy(threadPolicy);
                        rhrVar = rhrVar3;
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                    this.h = rhrVar;
                }
            }
        }
        return rhrVar;
    }

    public final rhu b() {
        rhu rhuVar;
        rhu rhuVar2 = this.j;
        if (rhuVar2 != null) {
            return rhuVar2;
        }
        synchronized (b) {
            rhuVar = this.j;
            if (rhuVar == null) {
                rhuVar = rhu.b;
                uhh uhhVarB = uhh.b(rhuVar);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        rhu rhuVar3 = (rhu) ((ueg) this.e.eV()).c(this.i, uhhVarB);
                        StrictMode.setThreadPolicy(threadPolicy);
                        rhuVar = rhuVar3;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (IOException unused) {
                }
                this.j = rhuVar;
            }
        }
        return rhuVar;
    }

    public final rml c(boolean z) {
        boolean z2;
        yyk yykVarJ;
        abvo abvoVar;
        String str;
        yyk yykVarJ2;
        yyk yykVarJ3;
        int i;
        boolean z3;
        boolean z4;
        String str2 = "";
        if (z) {
            rhu rhuVarB = b();
            z2 = rhuVarB.e;
            yykVarJ = yyk.j(new abxl(rhuVarB.i, rhu.a));
            abvoVar = rhuVarB.d;
            str = rhuVarB.f;
            yykVarJ2 = yyk.j(rhuVarB.g);
            yykVarJ3 = yyk.j(rhuVarB.h);
            if ((rhuVarB.c & 8) != 0) {
                rhw rhwVar = rhuVarB.j;
                if (rhwVar == null) {
                    rhwVar = rhw.a;
                }
                if (rhwVar.c == Build.VERSION.SDK_INT) {
                    rhw rhwVar2 = rhuVarB.j;
                    if (rhwVar2 == null) {
                        rhwVar2 = rhw.a;
                    }
                    str2 = rhwVar2.b;
                }
            }
            i = rhuVarB.c & 1;
            z3 = rhuVarB.l;
            z4 = rhuVarB.k;
        } else {
            rhr rhrVarA = a();
            z2 = rhrVarA.e;
            yykVarJ = yyk.j(new abxl(rhrVarA.j, rhr.a));
            abvoVar = rhrVarA.d;
            str = rhrVarA.f;
            yykVarJ2 = yyk.j(rhrVarA.h);
            yykVarJ3 = yyk.j(rhrVarA.i);
            if ((rhrVarA.c & 16) != 0) {
                rhw rhwVar3 = rhrVarA.k;
                if (rhwVar3 == null) {
                    rhwVar3 = rhw.a;
                }
                if (rhwVar3.c == Build.VERSION.SDK_INT) {
                    rhw rhwVar4 = rhrVarA.k;
                    if (rhwVar4 == null) {
                        rhwVar4 = rhw.a;
                    }
                    str2 = rhwVar4.b;
                }
            }
            i = rhrVarA.c & 1;
            z3 = rhrVarA.m;
            z4 = rhrVarA.l;
        }
        return new rml(z2, yykVarJ, abvoVar, str, str2, yykVarJ2, yykVarJ3, 1 == i, z3, z4);
    }

    public final zyd d(boolean z) {
        zyh zyhVar = (zyh) this.d.eV();
        zyhVar.getClass();
        return zuz.h(zwx.u(z ? zxn.i((zyd) this.l.eV()) : zxy.a), new zvi() { // from class: rne
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return zxn.i((zyd) this.a.f.eV());
            }
        }, zyhVar);
    }

    public final void e() {
        if (!mhv.g(this.k) && a().g + TimeUnit.HOURS.toMillis(24L) < System.currentTimeMillis()) {
            d(true);
        } else {
            zyd zydVar = zxy.a;
        }
    }
}
