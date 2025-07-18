package com.google.android.apps.play.movies.common.view.subtitles;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindowSnapshot implements Serializable, Parcelable {
    public static final Parcelable.Creator<SubtitleWindowSnapshot> CREATOR = new ParcelableCreator();
    public final SubtitleWindowSettings settings;
    public final int snapshotTimeMillis;
    public final String text;
    public final int windowId;

    /* compiled from: PG */
    final class ParcelableCreator implements Parcelable.Creator<SubtitleWindowSnapshot> {
        private ParcelableCreator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubtitleWindowSnapshot createFromParcel(Parcel parcel) {
            return new SubtitleWindowSnapshot(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubtitleWindowSnapshot[] newArray(int i) {
            return new SubtitleWindowSnapshot[i];
        }
    }

    public SubtitleWindowSnapshot(int i, int i2, String str, SubtitleWindowSettings subtitleWindowSettings) {
        this.windowId = i;
        this.snapshotTimeMillis = i2;
        this.text = str;
        this.settings = subtitleWindowSettings;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "id: " + this.windowId + " time: " + this.snapshotTimeMillis + " text: " + this.text + " settings: " + String.valueOf(this.settings);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.windowId);
        parcel.writeInt(this.snapshotTimeMillis);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.settings, 0);
    }

    private SubtitleWindowSnapshot(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readString(), (SubtitleWindowSettings) parcel.readParcelable(SubtitleWindowSettings.class.getClassLoader()));
    }
}
