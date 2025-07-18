package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfd {
    private static final AtomicInteger a = new AtomicInteger(0);

    public static final int a() {
        return a.addAndGet(1);
    }

    public static final bkp b(bkp bkpVar, boolean z, yjv yjvVar) {
        return bkpVar.a(new AppendedSemanticsElement(z, yjvVar));
    }
}
