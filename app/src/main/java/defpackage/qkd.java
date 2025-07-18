package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkd implements dhe {
    private final dhn a;

    public qkd(dhn dhnVar) {
        this.a = dhnVar;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) {
        String str = ((qju) ((qkg) obj).b()).c;
        str.getClass();
        return this.a.a(String.class, InputStream.class).a(str, i, i2, danVar);
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((qju) ((qkg) obj).b()).c != null;
    }
}
