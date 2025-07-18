package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ohu implements oce {
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public final ohr c;
    public final oin d;
    public final Executor e;
    public String f;
    public final ohz g;
    private final AtomicLong h = new AtomicLong(0);

    public ohu(ohr ohrVar, oin oinVar, Executor executor) {
        this.c = ohrVar;
        this.d = oinVar;
        this.g = new ohz(oinVar, executor);
        this.e = executor;
    }

    @Override // defpackage.oce
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.oce
    public final nzk b() {
        if (TextUtils.isEmpty(this.f)) {
            e();
        }
        return new oht(this);
    }

    @Override // defpackage.oce
    public final /* synthetic */ ofl c(int i) {
        return ocb.a(this, i);
    }

    @Override // defpackage.oce
    public final ofl d(final int i, nys nysVar) {
        if (TextUtils.isEmpty(this.f)) {
            e();
        }
        return new ofl() { // from class: ohs
            @Override // defpackage.ofl
            public final ofn a() {
                ohu ohuVar = this.b;
                return new oid(ohuVar.f, i, ohuVar.c, ohuVar.d, ohuVar.e);
            }
        };
    }

    public final void e() {
        this.h.set(((tmt) this.c).a.a() / 1000);
        this.f = this.d.b();
    }
}
