package defpackage;

import android.net.Uri;
import com.google.common.collect.Lists;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class plb extends plg {
    public final Uri a;
    public final String b;
    public final ple c;
    public final int d;
    public final yyk e;
    public final yqt f;
    private final abuy g;

    public plb(Uri uri, String str, ple pleVar, int i, yyk yykVar, yqt yqtVar, abuy abuyVar) {
        this.a = uri;
        this.b = str;
        this.c = pleVar;
        this.d = i;
        this.e = yykVar;
        this.f = yqtVar;
        this.g = abuyVar;
    }

    @Override // defpackage.plg
    public final int a() {
        return this.d;
    }

    @Override // defpackage.plg
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.plg
    public final ple c() {
        return this.c;
    }

    @Override // defpackage.plg
    public final yqt d() {
        return this.f;
    }

    @Override // defpackage.plg
    public final yyk e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof plg) {
            plg plgVar = (plg) obj;
            if (this.a.equals(plgVar.b()) && this.b.equals(plgVar.g()) && this.c.equals(plgVar.c()) && this.d == plgVar.a() && Lists.d(this.e, plgVar.e()) && this.f.equals(plgVar.d())) {
                abuy abuyVar = this.g;
                abuy abuyVarF = plgVar.f();
                if (abuyVar != abuyVarF) {
                    if (abuyVar.getClass() == abuyVarF.getClass()) {
                        if (abza.a.a(abuyVar.getClass()).k(abuyVar, abuyVarF)) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.plg
    public final abuy f() {
        return this.g;
    }

    @Override // defpackage.plg
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        int iB;
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
        abuy abuyVar = this.g;
        if ((abuyVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(abuyVar.getClass()).b(abuyVar);
        } else {
            int iB2 = abuyVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(abuyVar.getClass()).b(abuyVar);
                abuyVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (((iHashCode * 1000003) ^ 2040732332) * 1000003) ^ iB;
    }

    public final String toString() {
        return "DownloadRequest{fileUri=" + this.a.toString() + ", urlToDownload=" + this.b + ", downloadConstraints=" + this.c.toString() + ", trafficTag=" + this.d + ", extraHttpHeaders=" + this.e.toString() + ", inlineDownloadParamsOptional=Optional.absent(), customDownloaderMetadata=" + this.g.toString() + "}";
    }
}
