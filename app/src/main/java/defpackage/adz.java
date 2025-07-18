package defpackage;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adz {
    private final aeo a;
    private final Executor b;

    public adz(aeo aeoVar, Executor executor) {
        this.a = aeoVar;
        this.b = executor;
    }

    public final void a(aek aekVar) {
        if (aekVar.b != 0) {
            this.b.execute(new ady());
            return;
        }
        Typeface typeface = aekVar.a;
        this.b.execute(new adx(this.a, typeface));
    }
}
