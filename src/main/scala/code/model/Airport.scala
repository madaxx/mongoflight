package code.model

import net.liftweb.mongodb.record._
import net.liftweb.mongodb.record.field._
import net.liftweb.mongodb.record.field.ObjectIdPk
import net.liftweb.mongodb.record.{MongoMetaRecord, MongoRecord}
import net.liftweb.record.field._
import code.lib.{MongoCRUDify, BaseService}
import java.text.SimpleDateFormat
import xml.{ Text, NodeSeq}
import java.util.Date
import net.liftweb.util.Helpers._
import bootstrap.liftweb.MenuGroups
import com.foursquare.rogue.LatLong
import com.foursquare.rogue.LiftRogue


class Airport private () extends MongoRecord[Airport] with StringPk[Airport] {
  override def meta = Airport
  object airportid extends IntField(this)
  object name extends StringField(this,10)
  object city extends StringField(this,20)
  object country extends StringField(this,20)
  object iatafaa extends StringField(this,3)
  //object loc extends MongoCaseClassField[Airport, LatLong](this)
  object altitude extends IntField(this)
  object dst extends IntField(this)
  object timezone extends StringField(this,1)

}

object Airport extends Airport with MongoMetaRecord[Airport] with MongoCRUDify[Airport] {
  override def collectionName = "Airport"
  override def addlMenuLocParams = List(MenuGroups.TopBarGroup)
}



 
