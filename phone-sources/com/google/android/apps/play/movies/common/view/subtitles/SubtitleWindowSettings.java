package com.google.android.apps.play.movies.common.view.subtitles;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SubtitleWindowSettings implements Serializable, Parcelable {
    public static final int ANCHOR_BOTTOM = 32;
    public static final int ANCHOR_CENTER_HORIZONTAL = 2;
    public static final int ANCHOR_CENTER_VERTICAL = 16;
    public static final int ANCHOR_LEFT = 1;
    public static final int ANCHOR_POS_MAX = 100;
    public static final int ANCHOR_POS_MIN = 0;
    public static final int ANCHOR_RIGHT = 4;
    public static final int ANCHOR_TOP = 8;
    public static final int DEFAULT_ANCHOR_HORIZONTAL_POS = 50;
    public static final int DEFAULT_ANCHOR_POINT = 34;
    public static final int DEFAULT_ANCHOR_VERTICAL_POS = 95;
    public static final int SCROLL_DIRECTION_B2T = 3;
    public static final int SCROLL_DIRECTION_NO_SCROLL = -1;
    private static final long serialVersionUID = -517935151390173262L;
    public final int anchorHorizontalPos;
    public final int anchorPoint;
    public final int anchorVerticalPos;
    private final Integer scrollDirection;
    public final boolean visible;
    public static final Parcelable.Creator<SubtitleWindowSettings> CREATOR = new ParcelableCreator();
    public static final SubtitleWindowSettings DEFAULT_SUBTITLE_WINDOW_SETTINGS = new SubtitleWindowSettings(34, 50, 95, true, -1);

    /* compiled from: PG */
    final class ParcelableCreator implements Parcelable.Creator<SubtitleWindowSettings> {
        private ParcelableCreator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubtitleWindowSettings createFromParcel(Parcel parcel) {
            return new SubtitleWindowSettings(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubtitleWindowSettings[] newArray(int i) {
            return new SubtitleWindowSettings[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getScrollDirection() {
        Integer num = this.scrollDirection;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public String toString() {
        return "ap=" + this.anchorPoint + ", ah=" + this.anchorHorizontalPos + ", av=" + this.anchorVerticalPos + ", vs=" + this.visible;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.anchorPoint);
        parcel.writeInt(this.anchorHorizontalPos);
        parcel.writeInt(this.anchorVerticalPos);
        parcel.writeInt(this.visible ? 1 : 0);
        Integer num = this.scrollDirection;
        parcel.writeInt(num == null ? -1 : num.intValue());
    }

    public SubtitleWindowSettings(int i, int i2, int i3, boolean z, int i4) {
        a.aD(i2 >= 0 && i2 <= 100, a.cf(i2, "invalid anchorHorizontalPos: "));
        a.aD(i3 >= 0 && i3 <= 100, a.cf(i3, "invalid anchorVerticalPos: "));
        this.anchorPoint = i;
        this.anchorHorizontalPos = i2;
        this.anchorVerticalPos = i3;
        this.visible = z;
        this.scrollDirection = i4 == -1 ? null : 3;
    }

    private SubtitleWindowSettings(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
    }
}
