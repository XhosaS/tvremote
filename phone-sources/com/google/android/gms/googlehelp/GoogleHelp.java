package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.ocg;
import defpackage.ocv;
import defpackage.oeh;
import defpackage.oel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleHelp extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleHelp> CREATOR = new oel();
    public boolean A;
    public boolean B;
    public int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    boolean I;
    List J;

    @Deprecated
    String K;
    public int L;
    public int M;
    public List N;
    String O;
    Intent P;
    List Q;
    public ocv R;
    final int a;
    String b;
    public Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    public oeh s;
    List t;
    boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    public PendingIntent y;
    public int z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, oeh oehVar, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7, int i8, int i9, List list5, String str8, Intent intent, List list6) {
        this.v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i;
        this.z = i6;
        this.A = z4;
        this.B = z5;
        this.C = i7;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.E = z6;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i < 4) {
            oeh oehVar2 = new oeh();
            oehVar2.a = i4;
            this.s = oehVar2;
        } else {
            this.s = oehVar == null ? new oeh() : oehVar;
        }
        this.t = list3;
        this.u = z3;
        this.v = errorReport;
        if (errorReport != null) {
            errorReport.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i5;
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
        this.I = z8;
        this.J = list4;
        this.K = str7;
        this.L = i8;
        this.M = i9;
        this.N = list5;
        this.O = str8;
        this.P = intent;
        this.Q = list6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.O(parcel, 2, this.b);
        ocv.N(parcel, 3, this.c, i);
        ocv.E(parcel, 4, this.d);
        ocv.y(parcel, 5, this.h);
        ocv.y(parcel, 6, this.i);
        ocv.Q(parcel, 7, this.j);
        ocv.E(parcel, 10, this.k);
        ocv.N(parcel, 11, this.l, i);
        ocv.O(parcel, 14, this.p);
        ocv.N(parcel, 15, this.q, i);
        ocv.S(parcel, 16, this.r);
        ocv.B(parcel, 17, 0);
        ocv.S(parcel, 18, this.t);
        ocv.F(parcel, 19, this.m);
        ocv.B(parcel, 20, this.n);
        ocv.B(parcel, 21, this.o);
        ocv.y(parcel, 22, this.u);
        ocv.N(parcel, 23, this.v, i);
        ocv.N(parcel, 25, this.s, i);
        ocv.O(parcel, 28, this.e);
        ocv.N(parcel, 31, this.w, i);
        ocv.B(parcel, 32, this.x);
        ocv.N(parcel, 33, this.y, i);
        ocv.O(parcel, 34, this.f);
        ocv.N(parcel, 35, this.g, i);
        ocv.B(parcel, 36, this.z);
        ocv.y(parcel, 37, this.A);
        ocv.y(parcel, 38, this.B);
        ocv.B(parcel, 39, this.C);
        ocv.O(parcel, 40, this.D);
        ocv.y(parcel, 41, this.E);
        ocv.O(parcel, 42, this.F);
        ocv.y(parcel, 43, this.G);
        ocv.N(parcel, 44, this.H, i);
        ocv.y(parcel, 45, this.I);
        ocv.S(parcel, 46, this.J);
        ocv.O(parcel, 47, this.K);
        ocv.B(parcel, 48, this.L);
        ocv.B(parcel, 49, this.M);
        ocv.S(parcel, 50, this.N);
        ocv.O(parcel, 51, this.O);
        ocv.N(parcel, 52, this.P, i);
        ocv.Q(parcel, 53, this.Q);
        ocv.x(parcel, iV);
    }
}
