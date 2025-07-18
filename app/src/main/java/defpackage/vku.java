package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vku implements dhe {
    private final dhn a;

    public vku(dhn dhnVar) {
        this.a = dhnVar;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        return this.a.a(String.class, InputStream.class).a(((vpq) obj).b().h, i, i2, danVar);
    }

    @Override // defpackage.dhe
    public final /* synthetic */ boolean b(Object obj) {
        return (((vpq) obj).b().b & 32) != 0;
    }
}
