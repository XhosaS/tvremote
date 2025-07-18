package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqd extends yiz implements yjz {
    final /* synthetic */ boolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ ContentResolver c;
    final /* synthetic */ String d;
    final /* synthetic */ CancellationSignal e;
    final /* synthetic */ cil f;
    final /* synthetic */ yqg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqd(boolean z, Context context, ContentResolver contentResolver, String str, CancellationSignal cancellationSignal, cil cilVar, yqg yqgVar, yih yihVar) {
        super(2, yihVar);
        this.a = z;
        this.b = context;
        this.c = contentResolver;
        this.d = str;
        this.e = cancellationSignal;
        this.f = cilVar;
        this.g = yqgVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pqd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new pqd(this.a, this.b, this.c, this.d, this.e, this.f, this.g, yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
