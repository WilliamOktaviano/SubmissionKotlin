package pemrogramanmobile.submissionkotlin

import android.os.Parcel
import android.os.Parcelable

class TempatWisata : Parcelable {
    var objekwisata_name: String? = null
    var lokasi: String? = null
    var detailphoto: String? = null

    constructor(parcel: Parcel) {
        objekwisata_name = parcel.readString()
        lokasi = parcel.readString()
        detailphoto = parcel.readString()
    }

    constructor()

    override fun describeContents(): Int {
        return hashCode()
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(objekwisata_name)
        dest.writeString(lokasi)
        dest.writeString(detailphoto)
    }

    companion object CREATOR : Parcelable.Creator<TempatWisata> {
        override fun createFromParcel(parcel: Parcel): TempatWisata {
            return TempatWisata(parcel)
        }

        override fun newArray(size: Int): Array<TempatWisata?> {
            return arrayOfNulls(size)
        }
    }
}

