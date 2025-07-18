package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aase extends aast {
    public Context a;
    public URI b;
    public Executor c;
    public Executor d;
    public Executor e;
    public ScheduledExecutorService f;
    public String g;
    public yrp h;
    public Integer i;
    public Integer j;
    public long k;
    public int l;
    public long m;
    public long n;
    public byte o;

    @Override // defpackage.aast
    public final void a(long j) {
        this.m = j;
        this.o = (byte) (this.o | 4);
    }

    @Override // defpackage.aast
    public final void b(long j) {
        this.n = j;
        this.o = (byte) (this.o | 8);
    }

    @Override // defpackage.aast
    public final void c(int i) {
        this.l = i;
        this.o = (byte) (this.o | 2);
    }
}
