package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgj implements uqr {
    private final rmp b;
    private final ImmutableSet c;
    private final /* synthetic */ int d;

    public vgj(int i, byte[] bArr) {
        this.d = i;
        this.b = rmp.a(vgk.a, new rmp("GetStreamInfoUrl"));
        this.c = ImmutableSet.of();
    }

    @Override // defpackage.uqr
    public final rmp a() {
        switch (this.d) {
        }
        return this.b;
    }

    @Override // defpackage.uqr
    public final uqs b() {
        switch (this.d) {
        }
        return wen.g;
    }

    @Override // defpackage.uqr
    public final Set c() {
        switch (this.d) {
            case 0:
                ImmutableSet immutableSet = this.c;
                return immutableSet.isEmpty() ? vgk.g.h : immutableSet;
            case 1:
                ImmutableSet immutableSet2 = this.c;
                return immutableSet2.isEmpty() ? vgk.g.h : immutableSet2;
            case 2:
                ImmutableSet immutableSet3 = this.c;
                return immutableSet3.isEmpty() ? vyd.c.d : immutableSet3;
            case 3:
                ImmutableSet immutableSet4 = this.c;
                return immutableSet4.isEmpty() ? vyt.h.i : immutableSet4;
            case 4:
                ImmutableSet immutableSet5 = this.c;
                return immutableSet5.isEmpty() ? vyt.h.i : immutableSet5;
            case 5:
                ImmutableSet immutableSet6 = this.c;
                return immutableSet6.isEmpty() ? vyt.h.i : immutableSet6;
            case 6:
                ImmutableSet immutableSet7 = this.c;
                return immutableSet7.isEmpty() ? vyt.h.i : immutableSet7;
            case 7:
                ImmutableSet immutableSet8 = this.c;
                return immutableSet8.isEmpty() ? vyt.h.i : immutableSet8;
            case 8:
                ImmutableSet immutableSet9 = this.c;
                return immutableSet9.isEmpty() ? vyt.h.i : immutableSet9;
            case 9:
                ImmutableSet immutableSet10 = this.c;
                return immutableSet10.isEmpty() ? waz.e.f : immutableSet10;
            case 10:
                ImmutableSet immutableSet11 = this.c;
                return immutableSet11.isEmpty() ? waz.e.f : immutableSet11;
            case 11:
                ImmutableSet immutableSet12 = this.c;
                return immutableSet12.isEmpty() ? waz.e.f : immutableSet12;
            case 12:
                ImmutableSet immutableSet13 = this.c;
                return immutableSet13.isEmpty() ? wbc.c.d : immutableSet13;
            case 13:
                ImmutableSet immutableSet14 = this.c;
                return immutableSet14.isEmpty() ? wcr.e.f : immutableSet14;
            case 14:
                ImmutableSet immutableSet15 = this.c;
                return immutableSet15.isEmpty() ? wcr.e.f : immutableSet15;
            case 15:
                ImmutableSet immutableSet16 = this.c;
                return immutableSet16.isEmpty() ? wcr.e.f : immutableSet16;
            case 16:
                ImmutableSet immutableSet17 = this.c;
                return immutableSet17.isEmpty() ? wen.g.h : immutableSet17;
            case 17:
                ImmutableSet immutableSet18 = this.c;
                return immutableSet18.isEmpty() ? wen.g.h : immutableSet18;
            case 18:
                ImmutableSet immutableSet19 = this.c;
                return immutableSet19.isEmpty() ? wen.g.h : immutableSet19;
            case 19:
                ImmutableSet immutableSet20 = this.c;
                return immutableSet20.isEmpty() ? wen.g.h : immutableSet20;
            default:
                ImmutableSet immutableSet21 = this.c;
                return immutableSet21.isEmpty() ? wen.g.h : immutableSet21;
        }
    }

    @Override // defpackage.uqr
    public final boolean d() {
        int i = this.d;
        return (i == 10 || i == 11 || i == 14 || i == 15) ? false : true;
    }

    @Override // defpackage.uqr
    public final int e() {
        switch (this.d) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
                return 2;
            case 14:
            default:
                return 3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public final String toString() {
        switch (this.d) {
        }
        return this.b.a;
    }

    public vgj(int i) {
        this.d = i;
        this.b = rmp.a(vgk.a, new rmp("GetMpdForDashXml"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, char[] cArr) {
        this.d = i;
        this.b = rmp.a(vyd.a, new rmp("Fetch"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/android_video");
    }

    public vgj(int i, short[] sArr) {
        this.d = i;
        this.b = rmp.a(vyt.a, new rmp("GetFeed"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, int[] iArr) {
        this.d = i;
        this.b = rmp.a(vyt.a, new rmp("Search"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, boolean[] zArr) {
        this.d = i;
        this.b = rmp.a(vyt.a, new rmp("GetRelated"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, float[] fArr) {
        this.d = i;
        this.b = rmp.a(vyt.a, new rmp("Suggest"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, byte[][] bArr) {
        this.d = i;
        this.b = rmp.a(vyt.a, new rmp("FetchByToken"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, char[][] cArr) {
        this.d = i;
        this.b = rmp.a(vyt.a, new rmp("GetPlaylist"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, short[][] sArr) {
        this.d = i;
        this.b = rmp.a(waz.a, new rmp("FetchAsset"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/android_video");
    }

    public vgj(int i, int[][] iArr) {
        this.d = i;
        this.b = rmp.a(waz.a, new rmp("BatchFetchPersonalizedAsset"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, boolean[][] zArr) {
        this.d = i;
        this.b = rmp.a(waz.a, new rmp("FetchAssetReviews"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, float[][] fArr) {
        this.d = i;
        this.b = rmp.a(wbc.a, new rmp("FetchByToken"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, byte[][][] bArr) {
        this.d = i;
        this.b = rmp.a(wcr.a, new rmp("Fetch"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/android_video");
    }

    public vgj(int i, char[][][] cArr) {
        this.d = i;
        this.b = rmp.a(wcr.a, new rmp("Update"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, short[][][] sArr) {
        this.d = i;
        this.b = rmp.a(wcr.a, new rmp("FetchByToken"));
        this.c = ImmutableSet.of();
    }

    public vgj(int i, int[][][] iArr) {
        this.d = i;
        this.b = rmp.a(wen.a, new rmp("GetDisclosure"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/sherlog-optin");
    }

    public vgj(int i, boolean[][][] zArr) {
        this.d = i;
        this.b = rmp.a(wen.a, new rmp("StartLogging"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/sherlog-optin");
    }

    public vgj(int i, float[][][] fArr) {
        this.d = i;
        this.b = rmp.a(wen.a, new rmp("EndLogging"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/sherlog-optin");
    }

    public vgj(int i, byte[] bArr, byte[] bArr2) {
        this.d = i;
        this.b = rmp.a(wen.a, new rmp("ReleaseLogs"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/sherlog-optin");
    }

    public vgj(int i, char[] cArr, byte[] bArr) {
        this.d = i;
        this.b = rmp.a(wen.a, new rmp("UploadLogs"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/sherlog-optin");
    }
}
