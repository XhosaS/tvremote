package defpackage;

import android.webkit.WebView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxt {
    public final Optional a;
    public final agpc b = agpd.a(2, new agum() { // from class: uxs
        @Override // defpackage.agum
        public final Object a() {
            this.a.a.isPresent();
            if ("".length() > 0) {
                WebView.setDataDirectorySuffix("");
            }
            return "";
        }
    });

    public uxt(Optional optional) {
        this.a = optional;
    }
}
