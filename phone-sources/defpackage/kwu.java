package defpackage;

import com.google.android.apps.play.movies.common.model.AutoValue_SubtitleTrack;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwu {
    private String a;
    private String b;
    private String c;
    private int d;
    private String e;
    private boolean f;
    private boolean g;
    private int h;
    private byte i;

    public final kwx a() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.i == 15 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.c) != null && (str4 = this.e) != null) {
            return new AutoValue_SubtitleTrack(str, str2, str3, this.d, str4, this.f, this.g, this.h, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" languageCode");
        }
        if (this.b == null) {
            sb.append(" trackName");
        }
        if (this.c == null) {
            sb.append(" videoId");
        }
        if ((this.i & 1) == 0) {
            sb.append(" format");
        }
        if (this.e == null) {
            sb.append(" url");
        }
        if ((this.i & 2) == 0) {
            sb.append(" isForced");
        }
        if ((this.i & 4) == 0) {
            sb.append(" isClosedCaption");
        }
        if ((this.i & 8) == 0) {
            sb.append(" fileVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.h = i;
        this.i = (byte) (this.i | 8);
    }

    public final void c(int i) {
        this.d = i;
        this.i = (byte) (this.i | 1);
    }

    public final void d(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 4);
    }

    public final void e(boolean z) {
        this.f = z;
        this.i = (byte) (this.i | 2);
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null languageCode");
        }
        this.a = str;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null trackName");
        }
        this.b = str;
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.e = str;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.c = str;
    }
}
