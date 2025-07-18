package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lsd extends kes {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new lsf(), lvq.c(null));
    }

    public lsd(Context context) {
        super(context, null, lrj.a, kee.a, ker.a);
    }

    private static lvf r() {
        return lvq.b(new kej(new Status(16, null, null, null)));
    }

    public final lvf a(final String str) {
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrs
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int i = lsd.a;
                ((lsm) ((lsn) obj).v()).e(new lsc((lvj) obj2), str);
            }
        };
        return super.g(0, kibVar.a());
    }

    public final lvf b(final rgs rgsVar) {
        rgsVar.getClass();
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrv
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int iA;
                int i = lsd.a;
                lsc lscVar = new lsc((lvj) obj2);
                lsm lsmVar = (lsm) ((lsn) obj).v();
                rgs rgsVar2 = rgsVar;
                try {
                    int i2 = rgsVar2.memoizedSerializedSize;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(rgsVar2.getClass()).a(rgsVar2);
                        if (iA < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                        }
                    } else {
                        iA = i2 & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(rgsVar2.getClass()).a(rgsVar2);
                            if (iA < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                            }
                            rgsVar2.memoizedSerializedSize = (Integer.MIN_VALUE & rgsVar2.memoizedSerializedSize) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(rgsVar2.getClass()).m(rgsVar2, abwa.a(abvwVar));
                    abvwVar.K();
                    Parcel parcelA = lsmVar.a();
                    erv.c(parcelA, lscVar);
                    parcelA.writeByteArray(bArr);
                    lsmVar.J(31, parcelA);
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + rgsVar2.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            }
        };
        kibVar.c = new Feature[]{lrd.a};
        kibVar.b = false;
        return super.g(0, kibVar.a());
    }

    public final lvf c() {
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrk
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int i = lsd.a;
                lsm lsmVar = (lsm) ((lsn) obj).v();
                lrz lrzVar = new lrz((lvj) obj2);
                Parcel parcelA = lsmVar.a();
                erv.c(parcelA, lrzVar);
                lsmVar.J(27, parcelA);
            }
        };
        kibVar.c = new Feature[]{lrd.i};
        kibVar.b = false;
        return super.g(0, kibVar.a());
    }

    public final /* synthetic */ lvf d(final String str, final byte[] bArr, lvf lvfVar) {
        if (lvfVar.i()) {
            return lvfVar;
        }
        if (!o(11925000)) {
            return r();
        }
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrm
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int i = lsd.a;
                lsc lscVar = new lsc((lvj) obj2);
                lsm lsmVar = (lsm) ((lsn) obj).v();
                Parcel parcelA = lsmVar.a();
                erv.c(parcelA, lscVar);
                parcelA.writeString(str);
                parcelA.writeByteArray(bArr);
                lsmVar.J(20, parcelA);
            }
        };
        return super.g(0, kibVar.a());
    }

    public final lvf k(final String str, final int i, final String[] strArr, final byte[] bArr) {
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrr
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int i2 = lsd.a;
                lsc lscVar = new lsc((lvj) obj2);
                lsm lsmVar = (lsm) ((lsn) obj).v();
                Parcel parcelA = lsmVar.a();
                erv.c(parcelA, lscVar);
                parcelA.writeString(str);
                parcelA.writeInt(i);
                parcelA.writeStringArray(strArr);
                parcelA.writeByteArray(bArr);
                lsmVar.J(1, parcelA);
            }
        };
        return super.g(0, kibVar.a());
    }

    public final lvf l(final int[] iArr, final String str, final String str2) {
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrx
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int i = lsd.a;
                lsc lscVar = new lsc((lvj) obj2);
                lsm lsmVar = (lsm) ((lsn) obj).v();
                String[] strArr = {str2};
                Parcel parcelA = lsmVar.a();
                erv.c(parcelA, lscVar);
                parcelA.writeString("__internal.external_ids#".concat(str));
                parcelA.writeInt(0);
                parcelA.writeStringArray(strArr);
                parcelA.writeIntArray(iArr);
                parcelA.writeByteArray(null);
                lsmVar.J(2, parcelA);
            }
        };
        return super.g(0, kibVar.a());
    }

    public final lvf m(final String str, final aagu aaguVar) {
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrw
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int iA;
                int i = lsd.a;
                lry lryVar = new lry((lvj) obj2);
                lsm lsmVar = (lsm) ((lsn) obj).v();
                aagu aaguVar2 = aaguVar;
                try {
                    int i2 = aaguVar2.memoizedSerializedSize;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(aaguVar2.getClass()).a(aaguVar2);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i2 & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(aaguVar2.getClass()).a(aaguVar2);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            aaguVar2.memoizedSerializedSize = (Integer.MIN_VALUE & aaguVar2.memoizedSerializedSize) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(aaguVar2.getClass()).m(aaguVar2, abwa.a(abvwVar));
                    abvwVar.K();
                    String str2 = str;
                    Parcel parcelA = lsmVar.a();
                    erv.c(parcelA, lryVar);
                    parcelA.writeString(str2);
                    parcelA.writeByteArray(bArr);
                    lsmVar.J(25, parcelA);
                } catch (IOException e) {
                    throw new RuntimeException(a.u(aaguVar2, " to a byte array threw an IOException (should never happen)."), e);
                }
            }
        };
        kibVar.c = new Feature[]{lrd.h};
        kibVar.b = false;
        return super.g(0, kibVar.a());
    }

    public final lvf n(final String str, final String str2) {
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrt
            /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
            @Override // defpackage.khv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.Object r8, java.lang.Object r9) {
                /*
                    r7 = this;
                    lsn r8 = (defpackage.lsn) r8
                    lsc r0 = new lsc
                    lvj r9 = (defpackage.lvj) r9
                    r0.<init>(r9)
                    lsd r9 = r7.a
                    android.content.Context r9 = r9.b
                    android.content.pm.PackageManager r1 = r9.getPackageManager()
                    rns r2 = new rns
                    r2.<init>(r1)
                    java.lang.String r1 = r2
                    java.lang.String r9 = r9.getPackageName()
                    r3 = 0
                    rnr r2 = r2.a(r9)     // Catch: java.lang.Exception -> L3b
                    yrp r2 = r2.b     // Catch: java.lang.Exception -> L3b
                    java.lang.Object r2 = r2.eV()     // Catch: java.lang.Exception -> L3b
                    yyr r2 = (defpackage.yyr) r2     // Catch: java.lang.Exception -> L3b
                    java.lang.String r4 = defpackage.rns.b(r1)     // Catch: java.lang.Exception -> L3b
                    java.lang.Object r2 = r2.getOrDefault(r4, r3)     // Catch: java.lang.Exception -> L3b
                    rnq r2 = (defpackage.rnq) r2     // Catch: java.lang.Exception -> L3b
                    if (r2 != 0) goto L36
                    goto L4a
                L36:
                    aagy r9 = r2.a()     // Catch: java.lang.Exception -> L3b
                    goto L4b
                L3b:
                    java.lang.String r9 = java.lang.String.valueOf(r9)
                    java.lang.String r2 = "PhenotypeResourceReader"
                    java.lang.String r4 = "Error reading phenotype registration from "
                    java.lang.String r9 = r4.concat(r9)
                    android.util.Log.i(r2, r9)
                L4a:
                    r9 = r3
                L4b:
                    if (r9 != 0) goto L5a
                    com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
                    r9 = 29503(0x733f, float:4.1343E-41)
                    r8.<init>(r9, r3, r3, r3)
                    lvj r9 = r0.a
                    defpackage.kid.a(r8, r3, r9)
                    return
                L5a:
                    android.os.IInterface r8 = r8.v()
                    lsm r8 = (defpackage.lsm) r8
                    int r2 = r9.c
                    r4 = 2
                    r5 = 0
                    if (r2 != r4) goto L6f
                    java.lang.Object r2 = r9.d
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    int r2 = r2.intValue()
                    goto L70
                L6f:
                    r2 = r5
                L70:
                    java.lang.String r4 = r3
                    abxs r6 = r9.i
                    java.lang.String[] r5 = new java.lang.String[r5]
                    java.lang.Object[] r5 = r6.toArray(r5)
                    java.lang.String[] r5 = (java.lang.String[]) r5
                    abvo r9 = r9.j
                    byte[] r9 = r9.B()
                    android.os.Parcel r6 = r8.a()
                    defpackage.erv.c(r6, r0)
                    r6.writeString(r1)
                    r6.writeInt(r2)
                    r6.writeStringArray(r5)
                    r6.writeByteArray(r9)
                    r6.writeString(r4)
                    r6.writeString(r3)
                    r9 = 13
                    r8.J(r9, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lrt.a(java.lang.Object, java.lang.Object):void");
            }
        };
        return super.g(0, kibVar.a());
    }

    public final boolean o(int i) {
        return kcy.d.g(this.b, i) == 0;
    }

    public final lvf p(final String str) {
        if (!o(12451000)) {
            return r();
        }
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrq
            public final /* synthetic */ String b = "";

            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int i = lsd.a;
                lsc lscVar = new lsc((lvj) obj2);
                ((lsm) ((lsn) obj).v()).e(lscVar, "CURRENT:" + this.b + ":" + str);
            }
        };
        return super.g(0, kibVar.a());
    }

    public final lvf q(final String str, final String str2) {
        kib kibVar = new kib();
        kibVar.a = new khv() { // from class: lrl
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                int i = lsd.a;
                lsc lscVar = new lsc((lvj) obj2);
                lsm lsmVar = (lsm) ((lsn) obj).v();
                Parcel parcelA = lsmVar.a();
                erv.c(parcelA, lscVar);
                parcelA.writeString(str);
                parcelA.writeString(str2);
                parcelA.writeString(null);
                lsmVar.J(11, parcelA);
            }
        };
        return super.g(0, kibVar.a());
    }
}
