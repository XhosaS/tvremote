package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dze {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    private static final String aA;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final String K;
    public final String L;
    public final List M;
    public final String N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final String U;
    public final ead V;
    public final Object W;
    public final String X;
    public final String Y;
    public final int Z;
    private int aB;
    public final int aa;
    public final List ab;
    public final dza ac;
    public final long ad;
    public final boolean ae;
    public final int af;
    public final int ag;
    public final int ah;
    public final int ai;
    public final float aj;
    public final int ak;
    public final float al;
    public final byte[] am;
    public final int an;
    public final dyt ao;
    public final int ap;
    public final int aq;
    public final int ar;
    public final int as;
    public final int at;
    public final int au;
    public final int av;
    public final int aw;
    public final int ax;
    public final int ay;
    public final int az;
    public static final dze a = new dze(new dzd());
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);
    public static final String d = edt.Z(2);
    public static final String e = edt.Z(3);
    public static final String f = edt.Z(4);
    public static final String g = edt.Z(5);
    public static final String h = edt.Z(6);
    public static final String i = edt.Z(7);

    static {
        edt.Z(8);
        j = edt.Z(9);
        k = edt.Z(10);
        l = edt.Z(11);
        aA = edt.Z(12);
        m = edt.Z(13);
        n = edt.Z(14);
        o = edt.Z(15);
        p = edt.Z(16);
        q = edt.Z(17);
        r = edt.Z(18);
        s = edt.Z(19);
        t = edt.Z(20);
        u = edt.Z(21);
        v = edt.Z(22);
        w = edt.Z(23);
        x = edt.Z(24);
        y = edt.Z(25);
        z = edt.Z(26);
        A = edt.Z(27);
        B = edt.Z(28);
        C = edt.Z(29);
        D = edt.Z(30);
        E = edt.Z(31);
        F = edt.Z(32);
        G = edt.Z(33);
        H = edt.Z(34);
        I = edt.Z(35);
        J = edt.Z(36);
    }

    public dze(dzd dzdVar) {
        boolean z2;
        String str;
        this.K = dzdVar.a;
        String strAa = edt.aa(dzdVar.d);
        this.N = strAa;
        int i2 = 1;
        if (dzdVar.c.isEmpty() && dzdVar.b != null) {
            this.M = ImmutableList.of(new dzj(strAa, dzdVar.b));
            this.L = dzdVar.b;
        } else if (!dzdVar.c.isEmpty() && dzdVar.b == null) {
            this.M = dzdVar.c;
            List list = dzdVar.c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((dzj) list.get(0)).d;
                    break;
                }
                dzj dzjVar = (dzj) it.next();
                if (TextUtils.equals(dzjVar.c, strAa)) {
                    str = dzjVar.d;
                    break;
                }
            }
            this.L = str;
        } else if (dzdVar.c.isEmpty() && dzdVar.b == null) {
            z2 = true;
            a.ab(z2);
            this.M = dzdVar.c;
            this.L = dzdVar.b;
        } else {
            for (int i3 = 0; i3 < dzdVar.c.size(); i3++) {
                if (((dzj) dzdVar.c.get(i3)).d.equals(dzdVar.b)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            a.ab(z2);
            this.M = dzdVar.c;
            this.L = dzdVar.b;
        }
        this.O = dzdVar.e;
        eci.b(dzdVar.g == 0 || (dzdVar.f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.P = dzdVar.f;
        this.Q = dzdVar.g;
        int i4 = dzdVar.h;
        this.R = i4;
        int i5 = dzdVar.i;
        this.S = i5;
        this.T = i5 != -1 ? i5 : i4;
        this.U = dzdVar.j;
        this.V = dzdVar.k;
        this.W = null;
        this.X = dzdVar.l;
        this.Y = dzdVar.m;
        this.Z = dzdVar.n;
        this.aa = dzdVar.o;
        List list2 = dzdVar.p;
        this.ab = list2 == null ? Collections.EMPTY_LIST : list2;
        dza dzaVar = dzdVar.q;
        this.ac = dzaVar;
        this.ad = dzdVar.r;
        this.ae = dzdVar.s;
        this.af = dzdVar.t;
        this.ag = dzdVar.u;
        this.ah = dzdVar.v;
        this.ai = dzdVar.w;
        this.aj = dzdVar.x;
        int i6 = dzdVar.y;
        this.ak = i6 == -1 ? 0 : i6;
        float f2 = dzdVar.z;
        this.al = f2 == -1.0f ? 1.0f : f2;
        this.am = dzdVar.A;
        this.an = dzdVar.B;
        this.ao = dzdVar.C;
        this.ap = dzdVar.D;
        this.aq = dzdVar.E;
        this.ar = dzdVar.F;
        this.as = dzdVar.G;
        int i7 = dzdVar.H;
        this.at = i7 == -1 ? 0 : i7;
        int i8 = dzdVar.I;
        this.au = i8 == -1 ? 0 : i8;
        this.av = dzdVar.J;
        this.aw = dzdVar.K;
        this.ax = dzdVar.L;
        this.ay = dzdVar.M;
        int i9 = dzdVar.N;
        if (i9 != 0) {
            i2 = i9;
        } else if (dzaVar == null) {
            i2 = 0;
        }
        this.az = i2;
    }

    public static Object d(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    public static String e(int i2) {
        return aA + "_" + Integer.toString(i2, 36);
    }

    public static String f(dze dzeVar) throws IOException {
        String str;
        int i2;
        int i3;
        if (dzeVar == null) {
            return "null";
        }
        tsp tspVar = new tsp(",");
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(dzeVar.K);
        sb.append(", mimeType=");
        sb.append(dzeVar.Y);
        String str2 = dzeVar.X;
        if (str2 != null) {
            sb.append(", container=");
            sb.append(str2);
        }
        int i4 = dzeVar.T;
        if (i4 != -1) {
            sb.append(", bitrate=");
            sb.append(i4);
        }
        String str3 = dzeVar.U;
        if (str3 != null) {
            sb.append(", codecs=");
            sb.append(str3);
        }
        dza dzaVar = dzeVar.ac;
        if (dzaVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i5 = 0; i5 < dzaVar.c; i5++) {
                UUID uuid = dzaVar.a(i5).a;
                if (uuid.equals(dys.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(dys.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(dys.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(dys.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(dys.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add(a.ch(uuid, "unknown (", ")"));
                }
            }
            sb.append(", drm=[");
            tspVar.e(sb, linkedHashSet);
            sb.append(']');
        }
        int i6 = dzeVar.af;
        if (i6 != -1 && (i3 = dzeVar.ag) != -1) {
            sb.append(", res=");
            sb.append(i6);
            sb.append("x");
            sb.append(i3);
        }
        int i7 = dzeVar.ah;
        if (i7 != -1 && (i2 = dzeVar.ai) != -1) {
            sb.append(", decRes=");
            sb.append(i7);
            sb.append("x");
            sb.append(i2);
        }
        float f2 = dzeVar.al;
        int i8 = udm.a;
        double d2 = f2;
        if (Math.copySign((-1.0d) + d2, 1.0d) > 0.001d && d2 != 1.0d && (!Double.isNaN(d2) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            sb.append(edt.R("%.3f", Float.valueOf(f2)));
        }
        dyt dytVar = dzeVar.ao;
        int i9 = 2;
        if (dytVar != null && (dytVar.f() || dytVar.g())) {
            sb.append(", color=");
            String strR = dytVar.g() ? edt.R("%s/%s/%s", dyt.d(dytVar.h), dyt.c(dytVar.i), dyt.e(dytVar.j)) : "NA/NA/NA";
            sb.append(a.cq(dytVar.f() ? dytVar.l + "/" + dytVar.m : "NA/NA", strR, "/"));
        }
        float f3 = dzeVar.aj;
        if (f3 != -1.0f) {
            sb.append(", fps=");
            sb.append(f3);
        }
        int i10 = dzeVar.ap;
        if (i10 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i10);
        }
        int i11 = dzeVar.aq;
        if (i11 != -1) {
            sb.append(", channels=");
            sb.append(i11);
        }
        int i12 = dzeVar.ar;
        if (i12 != -1) {
            sb.append(", sample_rate=");
            sb.append(i12);
        }
        String str4 = dzeVar.N;
        if (str4 != null) {
            sb.append(", language=");
            sb.append(str4);
        }
        List list = dzeVar.M;
        if (!list.isEmpty()) {
            sb.append(", labels=[");
            tspVar.e(sb, Lists.transform(list, new dzc(i9)));
            sb.append("]");
        }
        int i13 = dzeVar.O;
        if (i13 != 0) {
            sb.append(", selectionFlags=[");
            String str5 = edt.a;
            ArrayList arrayList = new ArrayList();
            if ((i13 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i13 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i13 & 2) != 0) {
                arrayList.add("forced");
            }
            tspVar.e(sb, arrayList);
            sb.append("]");
        }
        int i14 = dzeVar.P;
        if (i14 != 0) {
            sb.append(", roleFlags=[");
            int i15 = i14 & 32768;
            String str6 = edt.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i14 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i14 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i14 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i14 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i14 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i14 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i14 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i14 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i15 != 0) {
                arrayList2.add("auxiliary");
            }
            tspVar.e(sb, arrayList2);
            sb.append("]");
        }
        if ((i14 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i16 = dzeVar.Q;
            String str7 = edt.a;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final int a() {
        int i2;
        int i3 = this.af;
        if (i3 == -1 || (i2 = this.ag) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final dze b(int i2) {
        dzd dzdVar = new dzd(this);
        dzdVar.N = i2;
        return new dze(dzdVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dze c(defpackage.dze r27) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dze.c(dze):dze");
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dze dzeVar = (dze) obj;
            int i3 = this.aB;
            if ((i3 == 0 || (i2 = dzeVar.aB) == 0 || i3 == i2) && this.O == dzeVar.O && this.P == dzeVar.P && this.Q == dzeVar.Q && this.R == dzeVar.R && this.S == dzeVar.S && this.Z == dzeVar.Z && this.ad == dzeVar.ad && this.af == dzeVar.af && this.ag == dzeVar.ag && this.ah == dzeVar.ah && this.ai == dzeVar.ai && this.ak == dzeVar.ak && this.an == dzeVar.an && this.ap == dzeVar.ap && this.aq == dzeVar.aq && this.ar == dzeVar.ar && this.as == dzeVar.as && this.at == dzeVar.at && this.au == dzeVar.au && this.av == dzeVar.av && this.ax == dzeVar.ax && this.ay == dzeVar.ay && this.az == dzeVar.az && Float.compare(this.aj, dzeVar.aj) == 0 && Float.compare(this.al, dzeVar.al) == 0 && Objects.equals(this.K, dzeVar.K) && Objects.equals(this.L, dzeVar.L) && this.M.equals(dzeVar.M) && Objects.equals(this.U, dzeVar.U) && Objects.equals(this.X, dzeVar.X) && Objects.equals(this.Y, dzeVar.Y) && Objects.equals(this.N, dzeVar.N) && Arrays.equals(this.am, dzeVar.am) && Objects.equals(this.V, dzeVar.V) && Objects.equals(this.ao, dzeVar.ao) && Objects.equals(this.ac, dzeVar.ac) && g(dzeVar) && Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(dze dzeVar) {
        List list = this.ab;
        int size = list.size();
        List list2 = dzeVar.ab;
        if (size != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = this.aB;
        if (i2 != 0) {
            return i2;
        }
        String str = this.K;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.L;
        int iHashCode2 = ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.M.hashCode();
        String str3 = this.N;
        int iHashCode3 = ((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31;
        String str4 = this.U;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ead eadVar = this.V;
        int iHashCode5 = iHashCode4 + (eadVar == null ? 0 : eadVar.hashCode());
        String str5 = this.X;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.Y;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.Z) * 31) + ((int) this.ad)) * 31) + this.af) * 31) + this.ag) * 31) + this.ah) * 31) + this.ai) * 31) + Float.floatToIntBits(this.aj)) * 31) + this.ak) * 31) + Float.floatToIntBits(this.al)) * 31) + this.an) * 31) + this.ap) * 31) + this.aq) * 31) + this.ar) * 31) + this.as) * 31) + this.at) * 31) + this.au) * 31) + this.av) * 31) + this.ax) * 31) + this.ay) * 31) + this.az;
        this.aB = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        return "Format(" + this.K + ", " + this.L + ", " + this.X + ", " + this.Y + ", " + this.U + ", " + this.T + ", " + this.N + ", [" + this.af + ", " + this.ag + ", " + this.aj + ", " + String.valueOf(this.ao) + "], [" + this.aq + ", " + this.ar + "])";
    }
}
