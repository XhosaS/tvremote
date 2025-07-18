package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.kna;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FeedbackOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kna();
    public String a;
    public Bundle b;
    public String c;
    final ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    final String g;
    public List h;
    public boolean i;
    public ThemeSettings j;
    public LogOptions k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;
    public boolean q;
    public String r;
    public AdditionalConsentConfig s;

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ThemeSettings themeSettings, LogOptions logOptions, boolean z2, Bitmap bitmap, String str5, boolean z3, long j, boolean z4, String str6, AdditionalConsentConfig additionalConsentConfig) {
        this.a = str;
        this.b = bundle == null ? new Bundle() : bundle;
        this.c = str2;
        this.d = applicationErrorReport == null ? new ApplicationErrorReport() : applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list == null ? new ArrayList() : list;
        this.i = z;
        this.j = themeSettings;
        this.k = logOptions;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
        this.q = z4;
        this.r = str6;
        this.s = additionalConsentConfig;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, this.a);
        kkx.i(parcel, 3, this.b);
        kkx.r(parcel, 5, this.c);
        kkx.q(parcel, 6, this.d, i);
        kkx.r(parcel, 7, this.e);
        kkx.q(parcel, 8, this.f, i);
        kkx.r(parcel, 9, this.g);
        kkx.v(parcel, 10, this.h);
        kkx.c(parcel, 11, this.i);
        kkx.q(parcel, 12, this.j, i);
        kkx.q(parcel, 13, this.k, i);
        kkx.c(parcel, 14, this.l);
        kkx.q(parcel, 15, this.m, i);
        kkx.r(parcel, 16, this.n);
        kkx.c(parcel, 17, this.o);
        kkx.g(parcel, 18, this.p);
        kkx.c(parcel, 19, this.q);
        kkx.r(parcel, 20, this.r);
        kkx.q(parcel, 21, this.s, i);
        kkx.b(parcel, iA);
    }
}
