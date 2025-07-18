package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzu implements uqr {
    private final rmp b;
    private final ImmutableSet c;
    private final /* synthetic */ int d;

    public wzu(int i, byte[] bArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("GetEntityStatus"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
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
        return wzw.S;
    }

    @Override // defpackage.uqr
    public final Set c() {
        switch (this.d) {
            case 0:
                ImmutableSet immutableSet = this.c;
                if (immutableSet.isEmpty()) {
                    break;
                }
                break;
            case 1:
                ImmutableSet immutableSet2 = this.c;
                if (immutableSet2.isEmpty()) {
                    break;
                }
                break;
            case 2:
                ImmutableSet immutableSet3 = this.c;
                if (immutableSet3.isEmpty()) {
                    break;
                }
                break;
            case 3:
                ImmutableSet immutableSet4 = this.c;
                if (immutableSet4.isEmpty()) {
                    break;
                }
                break;
            case 4:
                ImmutableSet immutableSet5 = this.c;
                if (immutableSet5.isEmpty()) {
                    break;
                }
                break;
            case 5:
                ImmutableSet immutableSet6 = this.c;
                if (immutableSet6.isEmpty()) {
                    break;
                }
                break;
            case 6:
                ImmutableSet immutableSet7 = this.c;
                if (immutableSet7.isEmpty()) {
                    break;
                }
                break;
            case 7:
                ImmutableSet immutableSet8 = this.c;
                if (immutableSet8.isEmpty()) {
                    break;
                }
                break;
            case 8:
                ImmutableSet immutableSet9 = this.c;
                if (immutableSet9.isEmpty()) {
                    break;
                }
                break;
            case 9:
                ImmutableSet immutableSet10 = this.c;
                if (immutableSet10.isEmpty()) {
                    break;
                }
                break;
            case 10:
                ImmutableSet immutableSet11 = this.c;
                if (immutableSet11.isEmpty()) {
                    break;
                }
                break;
            case 11:
                ImmutableSet immutableSet12 = this.c;
                if (immutableSet12.isEmpty()) {
                    break;
                }
                break;
            case 12:
                ImmutableSet immutableSet13 = this.c;
                if (immutableSet13.isEmpty()) {
                    break;
                }
                break;
            case 13:
                ImmutableSet immutableSet14 = this.c;
                if (immutableSet14.isEmpty()) {
                    break;
                }
                break;
            case 14:
                ImmutableSet immutableSet15 = this.c;
                if (immutableSet15.isEmpty()) {
                    break;
                }
                break;
            case 15:
                ImmutableSet immutableSet16 = this.c;
                if (immutableSet16.isEmpty()) {
                    break;
                }
                break;
            case 16:
                ImmutableSet immutableSet17 = this.c;
                if (immutableSet17.isEmpty()) {
                    break;
                }
                break;
            case 17:
                ImmutableSet immutableSet18 = this.c;
                if (immutableSet18.isEmpty()) {
                    break;
                }
                break;
            case 18:
                ImmutableSet immutableSet19 = this.c;
                if (immutableSet19.isEmpty()) {
                    break;
                }
                break;
            case 19:
                ImmutableSet immutableSet20 = this.c;
                if (immutableSet20.isEmpty()) {
                    break;
                }
                break;
            default:
                ImmutableSet immutableSet21 = this.c;
                if (immutableSet21.isEmpty()) {
                    break;
                }
                break;
        }
        return wzw.S.T;
    }

    @Override // defpackage.uqr
    public final boolean d() {
        return false;
    }

    @Override // defpackage.uqr
    public final int e() {
        int i = this.d;
        return (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 8 || i == 16 || i == 17) ? 3 : 2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public final String toString() {
        switch (this.d) {
        }
        return this.b.a;
    }

    public wzu(int i) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("BatchGetEntityStatuses"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, char[] cArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("UpdateEntitySentiment"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, short[] sArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("UpdateEntityWatchState"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, int[] iArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("UpdateWatchlist"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, boolean[] zArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("UpdateMediaProviderSelection"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, float[] fArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("UpdatePlaybackState"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, byte[][] bArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("GetPlaybackState"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, char[][] cArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("RecordWatchEvent"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, short[][] sArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("CheckIn"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, int[][] iArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("GetDestinations"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, boolean[][] zArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("ResolveLink"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, float[][] fArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("GetLibraryItems"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, byte[][][] bArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("GetLibraryItemStructure"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, char[][][] cArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("BatchGetLibraryItemMetadata"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, short[][][] sArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("GetContentRatings"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, int[][][] iArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("ShareFamilyEntity"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, boolean[][][] zArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("UnshareFamilyEntity"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, float[][][] fArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("GetUserProfile"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, byte[] bArr, byte[] bArr2) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("GetPlayCountry"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }

    public wzu(int i, char[] cArr, byte[] bArr) {
        this.d = i;
        this.b = rmp.a(wzw.b, new rmp("GetMediaLibraryConfig"));
        this.c = ImmutableSet.of("https://www.googleapis.com/auth/google_tv");
    }
}
