package android.support.v7.resources;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Compatibility {

    /* compiled from: PG */
    public class Api21Impl {
        private Api21Impl() {
        }

        public static Drawable createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        public static int getChangingConfigurations(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    private Compatibility() {
    }
}
