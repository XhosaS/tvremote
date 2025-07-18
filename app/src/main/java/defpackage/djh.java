package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class djh implements dap {
    private final djy a;

    public djh(djy djyVar) {
        this.a = djyVar;
    }

    @Override // defpackage.dap
    public final /* synthetic */ ddp a(Object obj, int i, int i2, dan danVar) {
        djy djyVar = this.a;
        return djyVar.a(new dki((ByteBuffer) obj, djyVar.g, djyVar.f), i, i2, danVar, djy.e);
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ boolean b(Object obj, dan danVar) {
        return true;
    }
}
