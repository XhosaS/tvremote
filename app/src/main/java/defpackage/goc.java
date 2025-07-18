package defpackage;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goc {
    public final String a;
    public final PlaybackState b;
    public final MediaMetadata c;

    public goc(String str, PlaybackState playbackState, MediaMetadata mediaMetadata) {
        this.a = str;
        this.b = playbackState;
        this.c = mediaMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goc)) {
            return false;
        }
        goc gocVar = (goc) obj;
        return agvy.c(this.a, gocVar.a) && agvy.c(this.b, gocVar.b) && agvy.c(this.c, gocVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LauncherxMediaInfo(packageName=" + this.a + ", playbackState=" + this.b + ", mediaMetadata=" + this.c + ")";
    }
}
