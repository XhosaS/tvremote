package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhx {
    public final zhe a;
    public final boolean b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;
    public final Long k;
    public final Long l;
    public final Long m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final List q;

    public zhx(zhe zheVar, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        str.getClass();
        this.a = zheVar;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = j4;
        this.i = i2;
        this.j = i3;
        this.k = l;
        this.l = l2;
        this.m = l3;
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = new ArrayList();
    }

    public /* synthetic */ zhx(zhe zheVar, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, int i4) {
        this(zheVar, ((i4 & 2) == 0) & z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & 128) != 0 ? -1L : j4, (i4 & 256) != 0 ? -1 : i2, (i4 & 512) != 0 ? -1 : i3, (i4 & 1024) != 0 ? null : l, (i4 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : l2, (i4 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : l3, null, null, null);
    }
}
