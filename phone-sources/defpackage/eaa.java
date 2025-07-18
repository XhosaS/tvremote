package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eaa {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public ImmutableList I;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public eaq i;
    public eaq j;
    public byte[] k;
    public Integer l;
    public Uri m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public Boolean r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public CharSequence y;
    public CharSequence z;

    public eaa(eab eabVar) {
        this.a = eabVar.b;
        this.b = eabVar.c;
        this.c = eabVar.d;
        this.d = eabVar.e;
        this.e = eabVar.f;
        this.f = eabVar.g;
        this.g = eabVar.h;
        this.h = eabVar.i;
        this.i = eabVar.j;
        this.j = eabVar.k;
        this.k = eabVar.l;
        this.l = eabVar.m;
        this.m = eabVar.n;
        this.n = eabVar.o;
        this.o = eabVar.p;
        this.p = eabVar.q;
        this.q = eabVar.r;
        this.r = eabVar.s;
        this.s = eabVar.u;
        this.t = eabVar.v;
        this.u = eabVar.w;
        this.v = eabVar.x;
        this.w = eabVar.y;
        this.x = eabVar.z;
        this.y = eabVar.A;
        this.z = eabVar.B;
        this.A = eabVar.C;
        this.B = eabVar.D;
        this.C = eabVar.E;
        this.D = eabVar.F;
        this.E = eabVar.G;
        this.F = eabVar.H;
        this.G = eabVar.I;
        this.I = eabVar.K;
        this.H = eabVar.J;
    }

    public final void a(byte[] bArr, int i) {
        if (this.k == null || i == 3 || !Objects.equals(this.l, 3)) {
            this.k = (byte[]) bArr.clone();
            this.l = Integer.valueOf(i);
        }
    }

    public final void b(byte[] bArr, Integer num) {
        this.k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = num;
    }

    public final void c(Long l) {
        a.H(l.longValue() >= 0);
        this.h = l;
    }

    public final void d(List list) {
        this.I = ImmutableList.copyOf((Collection) list);
    }

    public eaa() {
        this.I = ImmutableList.of();
    }
}
