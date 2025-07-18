package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.obd;
import defpackage.ocg;
import defpackage.ocv;
import defpackage.ods;
import defpackage.odz;
import defpackage.oeb;
import defpackage.oec;
import defpackage.oed;
import defpackage.oeh;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ErrorReport extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<ErrorReport> CREATOR = new obd(7);
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;

    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public oeb[] U;
    public String[] V;
    public boolean W;
    public String X;
    public oeh Y;
    public oec Z;
    public ApplicationErrorReport a;

    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public int aj;
    public String[] ak;
    public String[] al;
    public String[] am;
    public boolean an;
    public boolean ao;
    public String ap;
    public ods aq;
    public oed[] ar;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, this.a, i);
        ocv.O(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.O(parcel, 6, this.e);
        ocv.O(parcel, 7, this.f);
        ocv.O(parcel, 8, this.g);
        ocv.O(parcel, 9, this.h);
        ocv.O(parcel, 10, this.i);
        ocv.O(parcel, 11, this.j);
        ocv.B(parcel, 12, this.k);
        ocv.O(parcel, 13, this.l);
        ocv.O(parcel, 14, this.m);
        ocv.O(parcel, 15, this.n);
        ocv.O(parcel, 16, this.o);
        ocv.O(parcel, 17, this.p);
        ocv.P(parcel, 18, this.q);
        ocv.P(parcel, 19, this.r);
        ocv.P(parcel, 20, this.s);
        ocv.O(parcel, 21, this.t);
        ocv.O(parcel, 22, this.u);
        ocv.F(parcel, 23, this.v);
        ocv.B(parcel, 24, this.w);
        ocv.B(parcel, 25, this.x);
        ocv.B(parcel, 26, this.y);
        ocv.B(parcel, 27, this.z);
        ocv.O(parcel, 28, this.A);
        ocv.O(parcel, 29, this.B);
        ocv.O(parcel, 30, this.C);
        ocv.E(parcel, 31, this.D);
        ocv.y(parcel, 32, this.E);
        ocv.B(parcel, 33, this.F);
        ocv.B(parcel, 34, this.G);
        ocv.y(parcel, 35, this.H);
        ocv.O(parcel, 36, this.I);
        ocv.O(parcel, 37, this.J);
        ocv.B(parcel, 38, this.K);
        ocv.O(parcel, 39, this.L);
        ocv.O(parcel, 40, this.M);
        ocv.O(parcel, 41, this.N);
        ocv.O(parcel, 42, this.O);
        ocv.O(parcel, 43, this.P);
        ocv.O(parcel, 44, this.Q);
        ocv.O(parcel, 45, this.R);
        ocv.N(parcel, 46, this.S, i);
        ocv.O(parcel, 47, this.T);
        ocv.R(parcel, 48, this.U, i);
        ocv.P(parcel, 49, this.V);
        ocv.y(parcel, 50, this.W);
        ocv.O(parcel, 51, this.X);
        ocv.N(parcel, 52, this.Y, i);
        ocv.N(parcel, 53, this.Z, i);
        ocv.O(parcel, 54, this.aa);
        ocv.y(parcel, 55, this.ab);
        ocv.E(parcel, 56, this.ac);
        ocv.S(parcel, 57, this.ad);
        ocv.y(parcel, 58, this.ae);
        ocv.N(parcel, 59, this.af, i);
        ocv.O(parcel, 60, this.ag);
        ocv.Q(parcel, 61, this.ah);
        ocv.B(parcel, 62, this.ai);
        ocv.B(parcel, 63, this.aj);
        ocv.P(parcel, 64, this.ak);
        ocv.P(parcel, 65, this.al);
        ocv.P(parcel, 66, this.am);
        ocv.y(parcel, 67, this.an);
        ocv.y(parcel, 68, this.ao);
        ocv.O(parcel, 69, this.ap);
        ocv.N(parcel, 70, this.aq, i);
        ocv.R(parcel, 71, this.ar, i);
        ocv.x(parcel, iV);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, oeb[] oebVarArr, String[] strArr4, boolean z3, String str29, oeh oehVar, oec oecVar, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6, boolean z7, String str32, ods odsVar, oed[] oedVarArr) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = oebVarArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = oehVar;
        this.Z = oecVar;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
        this.aj = i11;
        this.ak = strArr5;
        this.al = strArr6;
        this.am = strArr7;
        this.an = z6;
        this.ao = z7;
        this.ap = str32;
        this.aq = odsVar;
        this.ar = oedVarArr;
    }

    public ErrorReport(odz odzVar, File file) {
        this.a = new ApplicationErrorReport();
        Bundle bundle = odzVar.b;
        if (bundle != null && !bundle.isEmpty()) {
            this.D = odzVar.b;
        }
        if (!TextUtils.isEmpty(odzVar.a)) {
            this.B = odzVar.a;
        }
        if (!TextUtils.isEmpty(odzVar.c)) {
            this.b = odzVar.c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = odzVar.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        oeh oehVar = odzVar.j;
        if (oehVar != null) {
            this.Y = oehVar;
        }
        if (!TextUtils.isEmpty(odzVar.e)) {
            this.P = odzVar.e;
        }
        String str = odzVar.g;
        if (!TextUtils.isEmpty(str)) {
            this.a.packageName = str;
        }
        if (!TextUtils.isEmpty(odzVar.n)) {
            this.ag = odzVar.n;
        }
        Bitmap bitmap = odzVar.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        if (file != null) {
            this.S = odzVar.f;
            List list = odzVar.h;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((oeb) it.next()).e = file;
                }
                this.U = (oeb[]) list.toArray(new oeb[0]);
            }
        }
        oec oecVar = odzVar.k;
        if (oecVar != null) {
            this.Z = oecVar;
        }
        this.W = odzVar.i;
        this.ae = odzVar.l;
        this.E = odzVar.o;
        this.an = odzVar.q;
        this.ap = odzVar.r;
        this.aq = odzVar.s;
    }
}
