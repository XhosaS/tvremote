package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class btl implements PointerInputEventHandler, yko {
    private final /* synthetic */ yjz a;

    public btl(yjz yjzVar) {
        this.a = yjzVar;
    }

    @Override // defpackage.yko
    public final yfq b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof yko)) {
            return yks.e(this.a, ((yko) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(bte bteVar, yih yihVar) {
        return this.a.a(bteVar, yihVar);
    }
}
