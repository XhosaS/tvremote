package defpackage;

import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zf {
    final Bundle a;

    public zf(Bundle bundle) {
        this.a = bundle;
    }

    public static zf l(Bundle bundle) {
        if (bundle != null) {
            return new zf(bundle);
        }
        return null;
    }

    public final int a() {
        return this.a.getInt("connectionState", 0);
    }

    public final int b() {
        return this.a.getInt("deviceType");
    }

    public final int c() {
        return this.a.getInt("playbackStream", -1);
    }

    public final int d() {
        return this.a.getInt("playbackType", 1);
    }

    public final int e() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public final int f() {
        return this.a.getInt("volume");
    }

    public final int g() {
        return this.a.getInt("volumeHandling", 0);
    }

    public final int h() {
        return this.a.getInt("volumeMax");
    }

    public final IntentSender i() {
        return (IntentSender) this.a.getParcelable("settingsIntent");
    }

    public final Uri j() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Bundle k() {
        return this.a.getBundle("extras");
    }

    public final String m() {
        return this.a.getString("status");
    }

    public final String n() {
        return this.a.getString("id");
    }

    public final String o() {
        return this.a.getString("name");
    }

    public final List p() {
        Bundle bundle = this.a;
        return !bundle.containsKey("controlFilters") ? new ArrayList() : new ArrayList(bundle.getParcelableArrayList("controlFilters"));
    }

    public final List q() {
        Bundle bundle = this.a;
        return !bundle.containsKey("groupMemberIds") ? new ArrayList() : new ArrayList(bundle.getStringArrayList("groupMemberIds"));
    }

    public final Set r() {
        Bundle bundle = this.a;
        return !bundle.containsKey("allowedPackages") ? new HashSet() : new HashSet(bundle.getStringArrayList("allowedPackages"));
    }

    public final boolean s() {
        return this.a.getBoolean("canDisconnect", false);
    }

    public final boolean t() {
        return this.a.getBoolean("enabled", true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(n());
        sb.append(", groupMemberIds=");
        sb.append(q());
        sb.append(", name=");
        sb.append(o());
        sb.append(", description=");
        sb.append(m());
        sb.append(", iconUri=");
        sb.append(j());
        sb.append(", isEnabled=");
        sb.append(t());
        sb.append(", isSystemRoute=");
        sb.append(u());
        sb.append(", connectionState=");
        sb.append(a());
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(p().toArray()));
        sb.append(", playbackType=");
        sb.append(d());
        sb.append(", playbackStream=");
        sb.append(c());
        sb.append(", deviceType=");
        sb.append(b());
        sb.append(", volume=");
        sb.append(f());
        sb.append(", volumeMax=");
        sb.append(h());
        sb.append(", volumeHandling=");
        sb.append(g());
        sb.append(", presentationDisplayId=");
        sb.append(e());
        sb.append(", extras=");
        sb.append(k());
        sb.append(", isValid=");
        sb.append(v());
        sb.append(", minClientVersion=");
        Bundle bundle = this.a;
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(Arrays.toString(r().toArray()));
        sb.append(" }");
        return sb.toString();
    }

    public final boolean u() {
        return this.a.getBoolean("isSystemRoute", false);
    }

    public final boolean v() {
        return (TextUtils.isEmpty(n()) || TextUtils.isEmpty(o()) || p().contains(null)) ? false : true;
    }
}
