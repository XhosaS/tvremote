package com.google.android.apps.play.movies.common.model;

import defpackage.ktw;
import defpackage.kwx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AutoValue_SubtitleTrack extends kwx {
    private static final long serialVersionUID = 6;
    private final int fileVersion;
    private final int format;
    private final boolean isClosedCaption;
    private final boolean isForced;
    private final String languageCode;
    private final String trackName;
    private final String url;
    private final String videoId;

    private AutoValue_SubtitleTrack(String str, String str2, String str3, int i, String str4, boolean z, boolean z2, int i2) {
        this.languageCode = str;
        this.trackName = str2;
        this.videoId = str3;
        this.format = i;
        this.url = str4;
        this.isForced = z;
        this.isClosedCaption = z2;
        this.fileVersion = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwx) {
            kwx kwxVar = (kwx) obj;
            if (this.languageCode.equals(kwxVar.languageCode()) && this.trackName.equals(kwxVar.trackName()) && this.videoId.equals(kwxVar.videoId()) && this.format == kwxVar.format() && this.url.equals(kwxVar.url()) && this.isForced == kwxVar.isForced() && this.isClosedCaption == kwxVar.isClosedCaption() && this.fileVersion == kwxVar.fileVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kwx
    public int fileVersion() {
        return this.fileVersion;
    }

    @Override // defpackage.kwx
    public int format() {
        return this.format;
    }

    public int hashCode() {
        return ((((((((((((((this.languageCode.hashCode() ^ 1000003) * 1000003) ^ this.trackName.hashCode()) * 1000003) ^ this.videoId.hashCode()) * 1000003) ^ this.format) * 1000003) ^ this.url.hashCode()) * 1000003) ^ (true != this.isForced ? 1237 : 1231)) * 1000003) ^ (true == this.isClosedCaption ? 1231 : 1237)) * 1000003) ^ this.fileVersion;
    }

    @Override // defpackage.kwx
    public boolean isClosedCaption() {
        return this.isClosedCaption;
    }

    @Override // defpackage.kwx
    public boolean isForced() {
        return this.isForced;
    }

    @Override // defpackage.kwx
    public String languageCode() {
        return this.languageCode;
    }

    @Override // defpackage.kwx
    public String trackName() {
        return this.trackName;
    }

    @Override // defpackage.kwx
    public String url() {
        return this.url;
    }

    @Override // defpackage.kwx
    public String videoId() {
        return this.videoId;
    }

    public /* synthetic */ AutoValue_SubtitleTrack(String str, String str2, String str3, int i, String str4, boolean z, boolean z2, int i2, ktw ktwVar) {
        this(str, str2, str3, i, str4, z, z2, i2);
    }
}
