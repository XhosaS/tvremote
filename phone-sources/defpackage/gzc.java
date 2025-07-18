package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzc extends jp {
    final /* synthetic */ gzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzc(int i, gzd gzdVar) {
        super(i);
        this.a = gzdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.jp
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        gza gzaVar = (gza) obj;
        rza rzaVar = (rza) obj2;
        gzaVar.getClass();
        rzaVar.getClass();
        Object obj4 = rzaVar.c;
        ?? r5 = rzaVar.b;
        int i = rzaVar.a;
        this.a.a.j(gzaVar, (Bitmap) obj4, r5, i);
    }

    @Override // defpackage.jp
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        rza rzaVar = (rza) obj2;
        ((gza) obj).getClass();
        rzaVar.getClass();
        return rzaVar.a;
    }
}
