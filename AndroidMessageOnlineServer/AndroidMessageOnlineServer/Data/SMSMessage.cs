namespace AndroidMessageOnlineServer.Data
{
    public class SMSMessage
    {
        public DateTime SendDate { get; set; }

        public int ID { get; set; }

        public string? Sender { get; set; }

        public string? Content { get; set; }
    }
}