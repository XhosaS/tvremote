package defpackage;

import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class map implements Serializable {
    private static final long serialVersionUID = -3818250238232542300L;

    private Object readResolve() {
        new Subtitles.Builder();
        throw null;
    }
}
