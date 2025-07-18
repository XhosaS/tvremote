package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.videos.R;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwc implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final /* synthetic */ int e;

    public lwc(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i) {
        this.e = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    public final idf a() throws Resources.NotFoundException {
        if (this.e != 0) {
            return lej.a((ExecutorService) this.b.b(), (String) this.a.b(), (idf) this.c.b(), ((Boolean) this.d.b()).booleanValue());
        }
        xcq xcqVar = this.b;
        Context contextA = ((rgq) this.a).a();
        lfn lfnVar = (lfn) xcqVar.b();
        xcq xcqVar2 = this.d;
        idf idfVarA = ((lwc) this.c).a();
        mma mmaVar = (mma) xcqVar2.b();
        int dimensionPixelSize = contextA.getResources().getDimensionPixelSize(R.dimen.knowledge_card_desired_image_size);
        idh idhVarD = idh.d();
        idhVarD.e(kzj.j);
        idhVarD.e(idfVarA);
        return new luq(mmaVar, idhVarD.b(new jxt(new len(dimensionPixelSize, mmaVar), 8)), (idf) new lvz(new lzh(new lfd(), new lbj(contextA, 5)), lfnVar.aL(), idfVarA, new len(dimensionPixelSize, mmaVar)), 3);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        return this.e != 0 ? a() : a();
    }

    public lwc(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }
}
