package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jag implements zea {
    public final /* synthetic */ yrn a;

    public /* synthetic */ jag(yrn yrnVar) {
        this.a = yrnVar;
    }

    @Override // defpackage.zea
    public final Object a() {
        return this.a.a(TimeUnit.MILLISECONDS) + " ms";
    }
}
