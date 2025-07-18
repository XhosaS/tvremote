package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awm implements PointerInputEventHandler {
    private final /* synthetic */ int c;
    public static final awm b = new awm(1);
    public static final awm a = new awm(0);

    public awm(int i) {
        this.c = i;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bte bteVar, yih yihVar) {
        return this.c != 0 ? ygi.a : ygi.a;
    }
}
