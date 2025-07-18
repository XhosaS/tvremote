package defpackage;

import android.media.AudioManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdg {
    public final Executor a;
    public final AudioManager b;
    public final zwv c = new zwv();

    public sdg(Executor executor, AudioManager audioManager) {
        this.a = new zyt(executor);
        this.b = audioManager;
    }
}
