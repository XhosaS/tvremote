package defpackage;

import android.graphics.Picture;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hca extends agtu implements agvb {
    int a;
    final /* synthetic */ hcb b;
    final /* synthetic */ Picture c;
    final /* synthetic */ File d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hca(hcb hcbVar, Picture picture, File file, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = hcbVar;
        this.c = picture;
        this.d = file;
        this.e = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hca) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        Object obj2 = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            hcb hcbVar = this.b;
            Picture picture = this.c;
            File file = this.d;
            String str = this.e;
            this.a = 1;
            Object objA = ahal.a(hcbVar.a, new hbz(file, str, picture, null), this);
            if (objA != obj2) {
                objA = agpu.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hca(this.b, this.c, this.d, this.e, agswVar);
    }
}
