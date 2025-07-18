package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzp {
    public UUID a;
    public Uri b;
    public ImmutableMap c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ImmutableList g;
    public byte[] h;

    public dzp(dzq dzqVar) {
        this.a = dzqVar.i;
        this.b = dzqVar.j;
        this.c = dzqVar.k;
        this.d = dzqVar.l;
        this.e = dzqVar.m;
        this.f = dzqVar.n;
        this.g = dzqVar.o;
        this.h = dzqVar.p;
    }

    @Deprecated
    public dzp() {
        this.c = ImmutableMap.of();
        this.e = true;
        this.g = ImmutableList.of();
    }

    public dzp(UUID uuid) {
        this();
        this.a = uuid;
    }
}
