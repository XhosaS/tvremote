package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhu extends agtu implements agvb {
    final /* synthetic */ jhv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhu(jhv jhvVar, agsw agswVar) {
        super(2, agswVar);
        this.a = jhvVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jhu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        jhv jhvVar = this.a;
        if (((Boolean) jhvVar.a.a()).booleanValue()) {
            return String.valueOf(jhvVar.b.getFilesDir().getAbsolutePath()).concat(String.valueOf(File.separator));
        }
        String absolutePath = jhvVar.b.getFilesDir().getAbsolutePath();
        absolutePath.getClass();
        return absolutePath;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jhu(this.a, agswVar);
    }
}
