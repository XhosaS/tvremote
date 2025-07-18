package defpackage;

import android.graphics.drawable.Drawable;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oge extends bwd {
    final /* synthetic */ ogf b;

    public oge(ogf ogfVar) {
        this.b = ogfVar;
    }

    @Override // defpackage.bwd
    public final void b(Drawable drawable) {
        ogf ogfVar = this.b;
        CommandOuterClass$Command commandOuterClass$Command = ogfVar.a;
        if (commandOuterClass$Command != null) {
            ogfVar.d.a(commandOuterClass$Command, nzx.p().e()).k();
        }
        ((dlz) drawable).start();
    }

    @Override // defpackage.bwd
    public final void c(Drawable drawable) {
    }
}
