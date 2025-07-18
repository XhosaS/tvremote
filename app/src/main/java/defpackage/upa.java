package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
class upa extends upd {
    final /* synthetic */ Object[] a;
    final /* synthetic */ String b;
    final /* synthetic */ upe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upa(upe upeVar, Object[] objArr, String str) {
        super(upeVar);
        this.a = objArr;
        this.b = str;
        this.c = upeVar;
    }

    @Override // defpackage.upx
    public final Cursor a(CancellationSignal cancellationSignal) {
        upe upeVar = this.c;
        upeVar.d.b();
        try {
            return upeVar.a.rawQueryWithFactory(new uqi(this.a), this.b, null, null, cancellationSignal);
        } finally {
            this.c.d.a();
        }
    }

    @Override // defpackage.upx
    public final String b() {
        return this.b;
    }
}
